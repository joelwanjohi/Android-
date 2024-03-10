package com.example.tutorialspoint7.myapplication;

import android.content.Intent;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The Activity onCreate() event");
    }

    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
        Log.d(msg, "The startService() event");
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
        Log.d(msg, "The stopService() event");
    }
}
