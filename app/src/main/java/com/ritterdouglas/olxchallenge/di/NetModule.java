package com.ritterdouglas.olxchallenge.di;

import dagger.Module;

@Module
public class NetModule {

    String mBaseUrl;

    public NetModule(String baseUrl) {
        mBaseUrl = baseUrl;
    }



}
