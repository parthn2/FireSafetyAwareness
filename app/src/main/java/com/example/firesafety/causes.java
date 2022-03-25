package com.example.firesafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class causes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causes);
    }

    public void OpenHousehold(View view) {
        Intent intent = new Intent( getApplicationContext(), household.class);
        startActivity(intent);
    }

    public void OpenIndustrial(View view) {
        Intent intent = new Intent( getApplicationContext(), industrial.class);
        startActivity(intent);
    }

}