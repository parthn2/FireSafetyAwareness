package com.example.firesafety;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);


        ActionBar actionBar;
        actionBar = getSupportActionBar();

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#09143C"));
        actionBar.setBackgroundDrawable(colorDrawable);
    }

    public void OpenProcedure(View view) {
        Intent intent = new Intent( MainActivity.this , procedure.class);
        startActivity(intent);
    }

    public void OpenKnowledge(View view) {
        Intent intent = new Intent( MainActivity.this , knowledge.class);
        startActivity(intent);
    }

    public void OpenVideos(View view) {
        Intent intent = new Intent( MainActivity.this , videos.class);
        startActivity(intent);
    }

    public void OpenFacts(View view) {
        Intent intent = new Intent( MainActivity.this , facts.class);
        startActivity(intent);
    }

    public void OpenHelp(View view) {
        Intent intent = new Intent( MainActivity.this , help.class);
        startActivity(intent);
    }
}