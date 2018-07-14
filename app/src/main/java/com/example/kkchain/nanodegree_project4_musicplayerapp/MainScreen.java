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
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the Action Bar Title
        setTitle("List of Songs");

        setContentView(R.layout.activity_main_screen);

        // Create an ArrayList of Album Song Titles
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("London Bridge","London Bridge is Falling Down",R.drawable.london_bridge));
        songs.add(new Song("Itsy Bitsy Spider","Nursery Rhyme", R.drawable.spider));
        songs.add(new Song("A,B,C,...Z","ABC songs for Children",R.drawable.abc));
        songs.add(new Song("Rain Rain Go Away","Chelsy Chain", R.drawable.rain));
        songs.add(new Song("Old MacDonald Has a Farm","E I E I O", R.drawable.farm));
        songs.add(new Song("The Wheel on the Bus","Go Round and Round",R.drawable.bus));
        songs.add(new Song("Twinkle Twinkle Little Star","Night Star" , R.drawable.stars));
        songs.add(new Song("Roll Roll Your Boat","Down the Stream", R.drawable.kayak));

        // Create a link to Listview and apply adapter
        final SongAdapter adapter = new SongAdapter(this, songs);
        ListView listV = findViewById(R.id.list_view_mainScreen);
        listV.setAdapter(adapter);

        //When the Main screen click, it pass to album activity

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song item = adapter.getItem(position);
                Intent intent = new Intent(MainScreen.this, album.class);
                intent.putExtra("songName", item.getTheSongName());
                intent.putExtra("artistName", item.getArtistName());
                int imageV = item.getImageResourceId();
                intent.putExtra("image", Integer.toString(imageV));
                startActivity(intent);
            }
        });

    }

}

