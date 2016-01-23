package com.uofthacks;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by danielchan on 23/1/16.
 */
public class RecycleFood extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());

    }

}


