package com.ritterdouglas.olxchallenge.networking.ads_search;

import com.ritterdouglas.olxchallenge.networking.NetworkingConstants;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface SearchAPI {

    @GET(NetworkingConstants.SEARCH_BY_CATEG_ID)
    Observable<Response<SearchResponse>> search(@Query(NetworkingConstants.CATEGORY_ID) int categoryId);

}
