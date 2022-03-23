package com.example.firesafety;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter {

    List<String> listTitle;
    List<Integer> imageList;
    Context context;

    public MyAdapter(@NonNull Context context, List<String> title, List<Integer> image) {
        super(context, R.layout.activity_videos, title);

        this.listTitle = title;
        this.imageList = image;
        this.context = context;

    }

    @NonNull
//    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.card, parent, false);
        ImageView imageView = view.findViewById(R.id.ImageView);
        TextView textView = view.findViewById(R.id.text);

        textView.setText(listTitle.get(position));
        imageView.setImageResource(imageList.get(position));

        return view;
    }
}