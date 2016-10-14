
package com.ritterdouglas.olxchallenge.networking.ads_search.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Datum {

    @SerializedName("h")
    private Long mH;
    @SerializedName("slot_id")
    private Long mSlotId;
    @SerializedName("w")
    private Long mW;

    public Long getH() {
        return mH;
    }

    public void setH(Long h) {
        mH = h;
    }

    public Long getSlotId() {
        return mSlotId;
    }

    public void setSlotId(Long slot_id) {
        mSlotId = slot_id;
    }

    public Long getW() {
        return mW;
    }

    public void setW(Long w) {
        mW = w;
    }

}
