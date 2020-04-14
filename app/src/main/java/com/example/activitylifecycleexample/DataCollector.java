package com.example.activitylifecycleexample;

public class DataCollector {
    private static DataCollector ourInstance = null;
    private String data;

    private DataCollector() {
        data = "New Session\n";
    }

    public static DataCollector getInstance() {
        if (ourInstance == null) {
            ourInstance = new DataCollector();
        }
        return ourInstance;
    }

    public void appendData(String appendThis) {
        data += appendThis;
    }

    public String getData() {
        return data;
    }
}
