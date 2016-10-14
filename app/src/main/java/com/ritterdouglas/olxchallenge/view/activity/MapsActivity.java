package com.ritterdouglas.olxchallenge.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.application.CustomApplication;
import com.ritterdouglas.olxchallenge.networking.ads_search.SearchManager;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;
import com.ritterdouglas.olxchallenge.view_model.MapsActivityViewModel;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

public class MapsActivity extends BaseFragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    public static final String TAG = MapsActivity.class.getSimpleName();
    public static final LatLng LISBON_LAT_LNT = new LatLng(38.730827, -9.137598);
    private GoogleMap mMap;

    @Inject Retrofit retrofit;

    private MapsActivityViewModel mViewModel;
    private Subscription searchSubscription;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((CustomApplication) getApplication()).getNetComponent().inject(this);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mViewModel = new MapsActivityViewModel(SearchManager.getInstance(this, retrofit));
        mViewModel.search(25);

        mapFragment.getMapAsync(this);

    }

    @Override public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LISBON_LAT_LNT));
    }

    public void addMarkersOnTheMap(List<Ad> adsList) {
        for(Ad item : adsList) {
            Marker marker = mMap.addMarker(mViewModel.convertAdIntoMarker(item));
            marker.setTag(item.getId());
        }
    }

    @Override protected void subscribeForNetworkRequests() {
        searchSubscription = mViewModel.getSearchSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SearchSubscriber());
    }

    @Override protected void unsubscribeFromNetworkRequests() {
        if (searchSubscription != null) {
            searchSubscription.unsubscribe();
        }
    }

    @Override protected void reconnectWithNetworkRequests() {
        searchSubscription = mViewModel.createSearchSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SearchSubscriber());
    }

    @Override public boolean onMarkerClick(Marker marker) {
        Log.e(TAG, "marker click - id: "+marker.getTag());

        return false;
    }

    private class SearchSubscriber extends Subscriber<Response<SearchResponse>> {
        @Override public void onCompleted() {
            // hide progress
            Log.e(TAG, "onCompleted - show next activity");
            Toast.makeText(getApplicationContext(), "onCompleted", Toast.LENGTH_SHORT).show();
//            openHomeActivity();
        }

        @Override public void onError(Throwable e) {
            // hide progress
            reconnectWithNetworkRequests();

            // test if errors are instanceof exceptions of our API
        }

        @Override public void onNext(Response<SearchResponse> searchResponse) {
            Log.e(TAG, "onNext");
            addMarkersOnTheMap(searchResponse.body().getAds());

        }
    }
}
