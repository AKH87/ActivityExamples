package org.sample.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    String logTag = "ActivityStatus";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.i(logTag,"Activity Created");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(logTag,"Activity Destroyed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(logTag,"Activity Started");
        Toast.makeText(this, "Welcome to my App", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(logTag,"Activity Stopped");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(logTag,"Activity Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(logTag,"Activity Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(logTag,"Activity Restarted");
    }
}
