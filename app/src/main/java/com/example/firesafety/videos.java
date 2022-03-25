package com.example.firesafety;

import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        List<String> link = new ArrayList<>();

        title.add("How to use fire extinguisher?");
        title.add("Methods of fire extinguishing");
        title.add("Safety Tips: Preventing fires  in the home");

        image.add(R.drawable.vid1);
        image.add(R.drawable.vid2);
        image.add(R.drawable.vid3);

        link.add("https://stackoverflow.com/questions/3004515/sending-an-intent-to-browser-to-open-specific-url");
        link.add("https://www.youtube.com/watch?v=Jmg5noJd0nI");
        link.add("https://www.youtube.com/watch?v=8vI30x9sa5o");

        MyAdapter myAdapter = new MyAdapter(this, title, image);
        listView.setAdapter((ListAdapter) myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(link.get(position))));
            }
        });
    }
}

