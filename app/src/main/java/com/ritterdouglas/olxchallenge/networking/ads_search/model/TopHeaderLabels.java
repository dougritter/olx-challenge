
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TopHeaderLabels {

    @SerializedName("category_icon")
    private String mCategoryIcon;
    @SerializedName("location_label")
    private String mLocationLabel;

    public String getCategoryIcon() {
        return mCategoryIcon;
    }

    public void setCategoryIcon(String category_icon) {
        mCategoryIcon = category_icon;
    }

    public String getLocationLabel() {
        return mLocationLabel;
    }

    public void setLocationLabel(String location_label) {
        mLocationLabel = location_label;
    }

}
