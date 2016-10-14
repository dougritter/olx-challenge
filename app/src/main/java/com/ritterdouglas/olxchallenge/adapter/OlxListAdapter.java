package com.ritterdouglas.olxchallenge.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.databinding.CardItemBinding;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.Ad;
import com.ritterdouglas.olxchallenge.networking.ads_search.model.SearchResponse;

import java.util.List;

public class OlxListAdapter extends RecyclerView.Adapter<OlxListAdapter.CustomViewHolder> {
    private List<Ad> adsList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private CardItemBinding mViewDataBinding;

        public CustomViewHolder(CardItemBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();

        }

        public CardItemBinding getViewDataBinding() {
            return mViewDataBinding;
        }

    }

    public OlxListAdapter(SearchResponse searchResponse) {
        if (searchResponse.getAds() != null) {
            this.adsList = searchResponse.getAds();
        }
    }

    @Override public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        CardItemBinding appItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.card_item, viewGroup, false);
        return new CustomViewHolder(appItemBinding);
    }

    @Override public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        CardItemBinding appItemBinding = customViewHolder.getViewDataBinding();
//        appItemBinding.setViewModel(new AppItemViewModel(mDataset.get(i)));
//        customViewHolder.itemView.setOnClickListener(v -> clickSubject.onNext(appItemBinding.getViewModel()));

    }

    @Override public int getItemCount() {
        return adsList.size();
    }
}