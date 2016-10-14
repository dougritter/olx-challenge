package com.ritterdouglas.olxchallenge.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ritterdouglas.olxchallenge.databinding.FragmentOlxMapBinding;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;
import com.ritterdouglas.olxchallenge.view.fragment.OlxListFragment;
import com.ritterdouglas.olxchallenge.view.fragment.OlxMapFragment;
import com.ritterdouglas.olxchallenge.view_model.FragmentMapViewModel;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public static final int POSITION_LIST = 0;
    public static final String TITLE_LIST = "Lista de ofertas";
    public static final String TITLE_MAP = "Mapa de ofertas";

    public static final String SEARCH_RESPONSE = "search_response_object";
    private SearchResponse mSearchResponse;

    public SectionsPagerAdapter(FragmentManager fm, SearchResponse searchResponse) {
        super(fm);
        this.mSearchResponse = searchResponse;
        adjustImageUrls();
    }

    @Override public Fragment getItem(int position) {
        if (position == POSITION_LIST) {
            return OlxListFragment.newInstance(mSearchResponse);
        } else {
            return OlxMapFragment.newInstance(mSearchResponse);
        }
    }

    @Override public int getCount() {
        return 2;
    }

    @Override public CharSequence getPageTitle(int position) {
        return position == POSITION_LIST ? TITLE_LIST : TITLE_MAP;
    }

    public void adjustImageUrls() {
        for (Ad item : mSearchResponse.getAds()) {
            item.setImageUrl(FragmentMapViewModel.getUrlOfImage(item));
        }
    }





}