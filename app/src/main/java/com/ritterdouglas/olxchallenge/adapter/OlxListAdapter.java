package com.ritterdouglas.olxchallenge.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.databinding.CardItemBinding;
import com.ritterdouglas.olxchallenge.databinding.ListCardItemBinding;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;

import java.util.List;

public class OlxListAdapter extends RecyclerView.Adapter<OlxListAdapter.CustomViewHolder> {
    private List<Ad> adsList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ListCardItemBinding mViewDataBinding;

        public CustomViewHolder(ListCardItemBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();

        }

        public ListCardItemBinding getViewDataBinding() {
            return mViewDataBinding;
        }

    }

    public OlxListAdapter(SearchResponse searchResponse) {
        if (searchResponse.getAds() != null) {
            this.adsList = searchResponse.getAds();
        }
    }

    @Override public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListCardItemBinding appItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.list_card_item, viewGroup, false);
        return new CustomViewHolder(appItemBinding);
    }

    @Override public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        ListCardItemBinding appItemBinding = customViewHolder.getViewDataBinding();
        appItemBinding.setViewModel(adsList.get(i));

    }

    @Override public int getItemCount() {
        return adsList.size();
    }
}