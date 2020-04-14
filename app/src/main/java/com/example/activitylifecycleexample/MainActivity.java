package com.example.activitylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataCollector.getInstance().appendData("In Activity 1 OnCreate()\n");
    }

    public void open_second_activity(View v) {
        Intent callActivity2 = new Intent(v.getContext(), SecondActivity.class);
        startActivity(callActivity2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        DataCollector.getInstance().appendData("In Activity 1 OnStart()\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        DataCollector.getInstance().appendData("In Activity 1 OnRestart()\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        DataCollector.getInstance().appendData("In Activity 1 OnStop()\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataCollector.getInstance().appendData("In Activity 1 OnDestroy()\n");

        if (isExternalStorageWritable()) {
            saveData();
        } else {
            Toast.makeText(this, "Not Readable", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        DataCollector.getInstance().appendData("In Activity 1 OnPause()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DataCollector.getInstance().appendData("In Activity 1 OnResume()\n");
    }

    /* Checks if external storage is available for read and write */
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }


    private void saveData() {
        File path = getCacheDir();
        File file = new File(path, "Data.txt");
        try {
            FileOutputStream stream = new FileOutputStream(file, true);

            //FileOutputStream stream = openFileOutput(file.getName(), Context.MODE_PRIVATE);
            stream.write(DataCollector.getInstance().getData().getBytes());
            stream.close();
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
