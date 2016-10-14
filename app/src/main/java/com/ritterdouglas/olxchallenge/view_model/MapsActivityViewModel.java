package com.ritterdouglas.olxchallenge.view_model;


import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ritterdouglas.olxchallenge.networking.ads_search.SearchManager;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;

import retrofit2.Response;
import rx.subjects.AsyncSubject;

public class MapsActivityViewModel {

    private AsyncSubject<Response<SearchResponse>> searchSubject;
    private SearchManager searchManager;

    public MapsActivityViewModel(SearchManager searchManager) {
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

}
