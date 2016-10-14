
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SearchResponse {

    @SerializedName("ads")
    private List<Ad> mAds;
    @SerializedName("ads_on_page")
    private Long mAdsOnPage;
    @SerializedName("adverts")
    private Adverts mAdverts;
    @SerializedName("category_id")
    private String mCategoryId;
    @SerializedName("next_page_url")
    private String mNextPageUrl;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("params")
    private Params mParams;
    @SerializedName("top_header_labels")
    private TopHeaderLabels mTopHeaderLabels;
    @SerializedName("total_ads")
    private Long mTotalAds;
    @SerializedName("total_pages")
    private Long mTotalPages;
    @SerializedName("view")
    private String mView;

    public List<Ad> getAds() {
        return mAds;
    }

    public void setAds(List<Ad> ads) {
        mAds = ads;
    }

    public Long getAdsOnPage() {
        return mAdsOnPage;
    }

    public void setAdsOnPage(Long ads_on_page) {
        mAdsOnPage = ads_on_page;
    }

    public Adverts getAdverts() {
        return mAdverts;
    }

    public void setAdverts(Adverts adverts) {
        mAdverts = adverts;
    }

    public String getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(String category_id) {
        mCategoryId = category_id;
    }

    public String getNextPageUrl() {
        return mNextPageUrl;
    }

    public void setNextPageUrl(String next_page_url) {
        mNextPageUrl = next_page_url;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Params getParams() {
        return mParams;
    }

    public void setParams(Params params) {
        mParams = params;
    }

    public TopHeaderLabels getTopHeaderLabels() {
        return mTopHeaderLabels;
    }

    public void setTopHeaderLabels(TopHeaderLabels top_header_labels) {
        mTopHeaderLabels = top_header_labels;
    }

    public Long getTotalAds() {
        return mTotalAds;
    }

    public void setTotalAds(Long total_ads) {
        mTotalAds = total_ads;
    }

    public Long getTotalPages() {
        return mTotalPages;
    }

    public void setTotalPages(Long total_pages) {
        mTotalPages = total_pages;
    }

    public String getView() {
        return mView;
    }

    public void setView(String view) {
        mView = view;
    }

}
