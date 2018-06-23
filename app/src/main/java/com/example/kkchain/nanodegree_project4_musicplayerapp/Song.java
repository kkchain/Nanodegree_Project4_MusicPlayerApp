package com.example.kkchain.nanodegree_project4_musicplayerapp;

public class Song {


    private String mSongName;


    // Get the song name from array
    public Song(String name){
        mSongName = name;
    }

    public String getTheSongName(){
        return mSongName;
    }
}