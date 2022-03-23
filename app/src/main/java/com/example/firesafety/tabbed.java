package com.example.firesafety;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.firesafety.ui.main.SectionsPagerAdapter;
import com.example.firesafety.databinding.ActivityTabbedBinding;

public class tabbed extends AppCompatActivity {

    private ActivityTabbedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabbedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.addTab(tabs.newTab().setText("Class A"));
        tabs.addTab(tabs.newTab().setText("Class B"));
        tabs.addTab(tabs.newTab().setText("Class C"));
        tabs.addTab(tabs.newTab().setText("Class D"));
        tabs.addTab(tabs.newTab().setText("Class K"));
    }
}