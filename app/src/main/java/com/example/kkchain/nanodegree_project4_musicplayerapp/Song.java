package com.example.kkchain.nanodegree_project4_musicplayerapp;

public class Song {

    // selected song from the list
    private String mSongName;


    // Get the song name from array list
    public Song(String name){
        mSongName = name;
    }

    public String getTheSongName(){
        return mSongName;
    }

}