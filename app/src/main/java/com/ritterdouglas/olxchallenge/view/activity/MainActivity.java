package com.ritterdouglas.olxchallenge.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.adapter.SectionsPagerAdapter;
import com.ritterdouglas.olxchallenge.application.CustomApplication;
import com.ritterdouglas.olxchallenge.databinding.ActivityMainBinding;
import com.ritterdouglas.olxchallenge.networking.ads_search.SearchManager;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;
import com.ritterdouglas.olxchallenge.view_model.ActivityMainViewModel;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject Retrofit retrofit;
    private Realm realm;

    private ActivityMainViewModel mViewModel;
    private ActivityMainBinding mBinding;
    private Subscription searchSubscription;
    private List<Ad> adsList;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ((CustomApplication) getApplication()).getNetComponent().inject(this);

        realm = Realm.getDefaultInstance();

        mViewModel = new ActivityMainViewModel(SearchManager.getInstance(this, retrofit));
        mViewModel.search(25);

    }

    @Override protected void subscribeForNetworkRequests() {
        searchSubscription = mViewModel.getSearchSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MainActivity.SearchSubscriber());
    }

    @Override protected void unsubscribeFromNetworkRequests() {
        if (searchSubscription != null) {
            searchSubscription.unsubscribe();
        }
    }

    @Override protected void reconnectWithNetworkRequests() {
        searchSubscription = mViewModel.createSearchSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MainActivity.SearchSubscriber());
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
            adsList = searchResponse.body().getAds();
//            addMarkersOnTheMap(searchResponse.body().getAds());

            SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager(), searchResponse.body());
            mBinding.viewPager.setAdapter(adapter);
//            mBinding.tabLayout.setupWithViewPager(mBinding.viewPager);

        }

    }


    @Override protected void onDestroy() {
        realm.close();
        super.onDestroy();
    }
}
