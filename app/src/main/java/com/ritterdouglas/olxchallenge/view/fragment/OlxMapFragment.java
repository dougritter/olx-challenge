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
import com.ritterdouglas.olxchallenge.databinding.FragmentOlxMapBinding;

public class OlxMapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    public static final String TAG = OlxMapFragment.class.getSimpleName();
    public static final LatLng LISBON_LAT_LNT = new LatLng(38.730827, -9.137598);
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private GoogleMap mMap;

    public OlxMapFragment() {}

    public static OlxMapFragment newInstance(String param1) {
        OlxMapFragment fragment = new OlxMapFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentOlxMapBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_olx_map, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return mBinding.getRoot();

    }

    @Override public boolean onMarkerClick(Marker marker) {
        Log.e(TAG, "marker click - id: "+marker.getTag());
        showDetails((String) marker.getTag());

        return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LISBON_LAT_LNT, 12.0f));
    }

    public void showDetails(String id) {
        /*if (adsList != null) {
            for(Ad item : adsList) {
                if (item.getId().equals(id)) {
                    if (mDetailContainer.getVisibility() != View.VISIBLE) {
                        mDetailContainer.setVisibility(View.VISIBLE);
                    }

                    Picasso.with(this).load(mViewModel.getUrlOfImage(item)).into(mDetailImage);

                    // mDetailImage
                    mDetailPrice.setText(item.getPriceNumeric());
                    mDetailTitle.setText(item.getTitle());
                    mDetailDescription.setText(item.getDescription());

                }
            }
        }*/

    }
}
