package com.ritterdouglas.olxchallenge.di;

import com.ritterdouglas.olxchallenge.MapsActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject (MapsActivity mapsActivity);


}
