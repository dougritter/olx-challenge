package com.ritterdouglas.olxchallenge.view_model;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ritterdouglas.olxchallenge.networking.NetworkingConstants;
import com.ritterdouglas.olxchallenge.networking.ads_search.SearchManager;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;

import retrofit2.Response;
import rx.subjects.AsyncSubject;

public class ActivityMainViewModel {

    private AsyncSubject<Response<SearchResponse>> searchSubject;
    private SearchManager searchManager;

    public ActivityMainViewModel(SearchManager searchManager) {
        this.searchManager = searchManager;
        searchSubject = AsyncSubject.create();
    }

    public void search(int id) {
        searchManager.search(id)
                .subscribe(searchSubject);

    }

    public AsyncSubject<Response<SearchResponse>> getSearchSubject() {
        return this.searchSubject;
    }

    public AsyncSubject<Response<SearchResponse>> createSearchSubject() {
        this.searchSubject = AsyncSubject.create();
        return this.searchSubject;
    }

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
