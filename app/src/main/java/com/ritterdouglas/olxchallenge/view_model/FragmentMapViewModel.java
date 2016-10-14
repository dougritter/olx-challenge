package com.ritterdouglas.olxchallenge.view_model;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ritterdouglas.olxchallenge.networking.NetworkingConstants;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;

public class FragmentMapViewModel {

    public MarkerOptions convertAdIntoMarker(Ad ad) {
        MarkerOptions options = new MarkerOptions()
                .position(new LatLng(ad.getMapLat(), ad.getMapLon()))
                .anchor(0.5f, 0.5f)
                .title(ad.getTitle());

        return options;

    }

    public String getUrlOfImage(Ad ad) {
        String imageUrl = "";

        try {
            imageUrl = NetworkingConstants.IMGS_BASE_URL
                    + "/" +ad.getPhotos().getRiakKey() + "_"
                    + ad.getPhotos().getRiakRing() + "_" +
                    + ad.getPhotos().getData().get(0).getW() + "x"
                    + ad.getPhotos().getData().get(0).getH()
                    + "_rev" + ad.getPhotos().getRiakRev() + ".jpg";

        } catch (NullPointerException e) {
            Log.e(MapsActivityViewModel.class.getSimpleName(), e.getMessage());

        }

        return imageUrl;

    }


}
