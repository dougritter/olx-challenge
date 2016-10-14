package com.ritterdouglas.olxchallenge.view.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.adapter.SectionsPagerAdapter;
import com.ritterdouglas.olxchallenge.databinding.FragmentOlxMapBinding;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;
import com.ritterdouglas.olxchallenge.view_model.FragmentMapViewModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class OlxMapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    public static final String TAG = OlxMapFragment.class.getSimpleName();
    public static final LatLng LISBON_LAT_LNT = new LatLng(38.730827, -9.137598);
    private SearchResponse mSearchResponse;
    private GoogleMap mMap;
    private FragmentMapViewModel mViewModel;
    FragmentOlxMapBinding mBinding;

    public OlxMapFragment() {}

    public static OlxMapFragment newInstance(SearchResponse searchResponse) {
        OlxMapFragment fragment = new OlxMapFragment();
        Bundle args = new Bundle();
        args.putParcelable(SectionsPagerAdapter.SEARCH_RESPONSE, searchResponse);
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mSearchResponse = getArguments().getParcelable(SectionsPagerAdapter.SEARCH_RESPONSE);
        }

        mViewModel = new FragmentMapViewModel();

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_olx_map, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return mBinding.getRoot();

    }

    @Override public boolean onMarkerClick(Marker marker) {
        showDetails((String) marker.getTag());
        return false;
    }

    @Override public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LISBON_LAT_LNT, 12.0f));

        addMarkersOnTheMap(mSearchResponse.getAds());

    }

    public void showDetails(String id) {
        for(Ad item : mSearchResponse.getAds()) {
            if (item.getId().equals(id)) {
                if (mBinding.detailsContainer.getVisibility() != View.VISIBLE) {
                    mBinding.detailsContainer.setVisibility(View.VISIBLE);
                }

                Picasso.with(getContext()).load(item.getImageUrl()).into(mBinding.layout.detailImage);

                mBinding.layout.detailPrice.setText(item.getPriceNumeric());
                mBinding.layout.detailTitle.setText(item.getTitle());
                mBinding.layout.detailDescription.setText(item.getDescription());

            }
        }

    }

    public void addMarkersOnTheMap(List<Ad> adsList) {
        for(Ad item : adsList) {
            Marker marker = mMap.addMarker(mViewModel.convertAdIntoMarker(item));
            marker.setTag(item.getId());
        }
    }

}
