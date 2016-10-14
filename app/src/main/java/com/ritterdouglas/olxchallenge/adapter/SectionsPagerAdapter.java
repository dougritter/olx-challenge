package com.ritterdouglas.olxchallenge.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.ritterdouglas.olxchallenge.view.fragment.OlxMapFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override public Fragment getItem(int position) {
        Log.e("getItem adapter", "position "+position);
        return OlxMapFragment.newInstance("");

    }

    @Override public int getCount() {
        return 2;
    }

    @Override public CharSequence getPageTitle(int position) {
        return null;
    }
}