package com.ritterdouglas.olxchallenge.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseFragmentActivity extends FragmentActivity {

    @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override protected void onResume() {
        super.onResume();
        subscribeForNetworkRequests();
    }

    @Override protected void onPause() {
        super.onPause();
        unsubscribeFromNetworkRequests();
    }

    protected abstract void subscribeForNetworkRequests();
    protected abstract void unsubscribeFromNetworkRequests();
    protected abstract void reconnectWithNetworkRequests();

}
