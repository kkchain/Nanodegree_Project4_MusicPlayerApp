package com.example.kkchain.nanodegree_project4_musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the Action Bar Title
        setTitle("Now Playing");

        setContentView(R.layout.activity_album);


        //Gather Intent Extra from MainScreen
        String selectedSong = getIntent().getStringExtra("songName");
        int selectedImage = Integer.parseInt(getIntent().getStringExtra("image"));

        //Populate XML with gathered intent extras from MainScreen Activity
        TextView album = findViewById(R.id.song_title);
        album.setText(selectedSong);

        ImageView i = findViewById(R.id.songImage);
        i.setImageResource(selectedImage);

    }
}
