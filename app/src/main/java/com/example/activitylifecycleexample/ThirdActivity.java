package com.example.activitylifecycleexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        DataCollector.getInstance().appendData("In Activity 3 OnCreate()\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        DataCollector.getInstance().appendData("In Activity 3 OnStart()\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        DataCollector.getInstance().appendData("In Activity 3 OnRestart()\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        DataCollector.getInstance().appendData("In Activity 3 OnStop()\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataCollector.getInstance().appendData("In Activity 3 OnDestroy()\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        DataCollector.getInstance().appendData("In Activity 3 OnPause()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataCollector.getInstance().appendData("In Activity 3 OnResume()\n");
    }
}
