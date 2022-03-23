package com.example.firesafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }

    public void OpenTabbed(View view) {
        Intent intent = new Intent( getApplicationContext(), tabbed.class);
        startActivity(intent);
    }
}