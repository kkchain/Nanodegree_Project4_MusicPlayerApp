package com.example.kkchain.nanodegree_project4_musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        // Create an ArrayList of Album Song Titles
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("London Bridge"));
        songs.add(new Song("Itsy Bitsy Spider"));
        songs.add(new Song("A,B,C...Z"));
        songs.add(new Song("Rain Rain Go Away"));
        songs.add(new Song("Old MacDonald Has a Farm"));
        songs.add(new Song("The Wheel on the Bus"));
        songs.add(new Song("Johny Johny Yes Papa"));


        // Create a link to Gridvirew and apply adapter
        SongAdapter adapter = new SongAdapter(this, songs);
        GridView gridView1 = findViewById(R.id.gridview);
        gridView1.setAdapter(adapter);


    }

}