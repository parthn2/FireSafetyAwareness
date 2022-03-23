package com.example.firesafety;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class videos extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        listView = findViewById(R.id.listView);

        List<String> title = new ArrayList<>();
        List<Integer> image = new ArrayList<>();

        title.add("Video1");
        title.add("Video2");
        title.add("Video3");

        image.add(R.drawable.background2);
        image.add(R.drawable.background2);
        image.add(R.drawable.background2);

        MyAdapter myAdapter = new MyAdapter(this, title, image);
        listView.setAdapter((ListAdapter) myAdapter);
    }
}

