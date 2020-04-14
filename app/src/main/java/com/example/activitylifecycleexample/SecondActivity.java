package com.example.activitylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DataCollector.getInstance().appendData("In Activity 2 OnCreate()\n");
    }

    public void open_third_activity(View v) {
        Intent callActivity3 = new Intent(v.getContext(), ThirdActivity.class);
        startActivity(callActivity3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        DataCollector.getInstance().appendData("In Activity 2 OnStart()\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        DataCollector.getInstance().appendData("In Activity 2 OnRestart()\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        DataCollector.getInstance().appendData("In Activity 2 OnStop()\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataCollector.getInstance().appendData("In Activity 2 OnDestroy()\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        DataCollector.getInstance().appendData("In Activity 2 OnPause()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataCollector.getInstance().appendData("In Activity 2 OnResume()\n");
    }
}
