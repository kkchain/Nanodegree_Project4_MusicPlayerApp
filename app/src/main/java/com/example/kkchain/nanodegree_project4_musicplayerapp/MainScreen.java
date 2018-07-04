package com.example.kkchain.nanodegree_project4_musicplayerapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
        songs.add(new Song("A,B,C,...Z"));
        songs.add(new Song("Rain Rain Go Away"));
        songs.add(new Song("Old MacDonald Has a Farm"));
        songs.add(new Song("The Wheel on the Bus"));
        songs.add(new Song("Twinkle Twinkle Little Star"));
        songs.add(new Song("Roll Roll Your Boat"));

        // Create a link to Listview and apply adapter
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listV = findViewById(R.id.list_view_mainScreen);
        listV.setAdapter(adapter);

        //When the Main screen click, it pass to album activity

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainScreen.this, album.class);
                startActivity(intent);
            }
        });

    }

}

