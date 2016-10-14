package com.ritterdouglas.olxchallenge.application;

import android.app.Application;

import com.ritterdouglas.olxchallenge.di.AppModule;
import com.ritterdouglas.olxchallenge.di.DaggerNetComponent;
import com.ritterdouglas.olxchallenge.di.NetComponent;
import com.ritterdouglas.olxchallenge.di.NetModule;
import com.ritterdouglas.olxchallenge.networking.NetworkingConstants;

public class CustomApplication extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(NetworkingConstants.BASE_URL))
                .build();

    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
