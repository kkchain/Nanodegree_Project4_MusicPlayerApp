package com.example.kkchain.nanodegree_project4_musicplayerapp;

public class Song {

    // selected song from the list
    private String mSongName;

    // Image resource ID for the word
    private int mImageResourceId;

    // Get the song name from array list
    public Song(String name, int ImageResourceId){
        mSongName = name;
        mImageResourceId = ImageResourceId;
    }

    public String getTheSongName(){
        return mSongName;
    }

    // Get image of the song
    public int getImageResourceId() {
        return mImageResourceId;
    }

}