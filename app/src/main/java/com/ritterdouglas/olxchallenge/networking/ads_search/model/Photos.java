
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Photos implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.mData);
        dest.writeValue(this.mRiakKey);
        dest.writeValue(this.mRiakRev);
        dest.writeValue(this.mRiakRing);
    }

    public Photos() {
    }

    protected Photos(Parcel in) {
        this.mData = new ArrayList<Datum>();
        in.readList(this.mData, Datum.class.getClassLoader());
        this.mRiakKey = (Long) in.readValue(Long.class.getClassLoader());
        this.mRiakRev = (Long) in.readValue(Long.class.getClassLoader());
        this.mRiakRing = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Parcelable.Creator<Photos> CREATOR = new Parcelable.Creator<Photos>() {
        @Override
        public Photos createFromParcel(Parcel source) {
            return new Photos(source);
        }

        @Override
        public Photos[] newArray(int size) {
            return new Photos[size];
        }
    };
}
