package com.uofthacks.recyclefood;

import android.location.Location;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;


import com.facebook.appevents.AppEventsLogger;
import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {

    private GoogleApiClient mGoogleApiClient;
    private Location mLastLocation;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);


        mRef = new Firebase("https://luminous-fire-5527.firebaseio.com/");
        mRef.authWithOAuthToken("google", "<OAuth Token>", new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                // the Google user is now authenticated with your Firebase app
            }
            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                // there was an error
            }
        });


    }

    protected void onResume() {
        super.onResume();
        AppEventsLogger.activateApp(this);

    }

}
