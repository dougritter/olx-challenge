
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Adverts {

    @SerializedName("config")
    private Object mConfig;
    @SerializedName("places")
    private Object mPlaces;

    public Object getConfig() {
        return mConfig;
    }

    public void setConfig(Object config) {
        mConfig = config;
    }

    public Object getPlaces() {
        return mPlaces;
    }

    public void setPlaces(Object places) {
        mPlaces = places;
    }

}
