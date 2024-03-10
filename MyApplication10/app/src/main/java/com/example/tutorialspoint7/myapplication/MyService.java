package com.example.tutorialspoint7.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import android.util.Log;

/**
 * Created by TutorialsPoint7 on 8/23/2016.
 */

public class MyService extends Service {
    String msg = "Android : ";
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        Log.d(msg, "The Service onStartCommand() event");
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The service onDestroy() event");
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
