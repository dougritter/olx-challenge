package com.ritterdouglas.olxchallenge.view_model;


import com.ritterdouglas.olxchallenge.networking.ads_search.SearchManager;

import rx.subjects.AsyncSubject;

public class MapsActivityViewModel {

    private AsyncSubject<Object> searchSubject;
    private SearchManager searchManager;

    public MapsActivityViewModel(SearchManager searchManager) {
        this.searchManager = searchManager;
        searchSubject = AsyncSubject.create();
    }

    public void search(int id) {
        searchManager.search(id)
                .subscribe(searchSubject);

    }

    public AsyncSubject<Object> getSearchSubject() {
        return this.searchSubject;
    }

    public AsyncSubject<Object> createSearchSubject() {
        this.searchSubject = AsyncSubject.create();
        return this.searchSubject;
    }

}
