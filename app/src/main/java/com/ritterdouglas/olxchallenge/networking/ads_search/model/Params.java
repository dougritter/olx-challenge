
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Params {

    @SerializedName("category")
    private Long mCategory;
    @SerializedName("city")
    private Long mCity;
    @SerializedName("params")
    private Params mParams;
    @SerializedName("region")
    private Long mRegion;
    @SerializedName("search")
    private List<Object> mSearch;
    @SerializedName("shopId")
    private Long mShopId;
    @SerializedName("subregion")
    private Long mSubregion;

    public Long getCategory() {
        return mCategory;
    }

    public void setCategory(Long category) {
        mCategory = category;
    }

    public Long getCity() {
        return mCity;
    }

    public void setCity(Long city) {
        mCity = city;
    }

    public Params getParams() {
        return mParams;
    }

    public void setParams(Params params) {
        mParams = params;
    }

    public Long getRegion() {
        return mRegion;
    }

    public void setRegion(Long region) {
        mRegion = region;
    }

    public List<Object> getSearch() {
        return mSearch;
    }

    public void setSearch(List<Object> search) {
        mSearch = search;
    }

    public Long getShopId() {
        return mShopId;
    }

    public void setShopId(Long shopId) {
        mShopId = shopId;
    }

    public Long getSubregion() {
        return mSubregion;
    }

    public void setSubregion(Long subregion) {
        mSubregion = subregion;
    }

}
