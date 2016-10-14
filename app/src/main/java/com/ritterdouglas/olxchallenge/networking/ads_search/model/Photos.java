
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Photos {

    @SerializedName("data")
    private List<Datum> mData;
    @SerializedName("riak_key")
    private Long mRiakKey;
    @SerializedName("riak_rev")
    private Long mRiakRev;
    @SerializedName("riak_ring")
    private Long mRiakRing;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public Long getRiakKey() {
        return mRiakKey;
    }

    public void setRiakKey(Long riak_key) {
        mRiakKey = riak_key;
    }

    public Long getRiakRev() {
        return mRiakRev;
    }

    public void setRiakRev(Long riak_rev) {
        mRiakRev = riak_rev;
    }

    public Long getRiakRing() {
        return mRiakRing;
    }

    public void setRiakRing(Long riak_ring) {
        mRiakRing = riak_ring;
    }

}
