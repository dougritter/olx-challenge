package com.ritterdouglas.olxchallenge.view.activity.custom;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class PicassoMarker implements Target {

    public static final String TAG = PicassoMarker.class.getSimpleName();
    private Marker mMarker;

    public PicassoMarker(Marker marker) {
        mMarker = marker;
    }

    @Override public int hashCode() {
        return mMarker.hashCode();
    }

    @Override public boolean equals(Object o) {
        if(o instanceof PicassoMarker) {
            Marker marker = ((PicassoMarker) o).mMarker;
            return mMarker.equals(marker);
        } else {
            return false;
        }
    }

    @Override public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
        mMarker.setIcon(BitmapDescriptorFactory.fromBitmap(bitmap));
    }

    @Override public void onBitmapFailed(Drawable errorDrawable) {
        Log.e(TAG, "onBitmapFailed");
    }

    @Override public void onPrepareLoad(Drawable placeHolderDrawable) {}
}