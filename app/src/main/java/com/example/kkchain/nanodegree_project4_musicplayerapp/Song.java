package com.example.kkchain.nanodegree_project4_musicplayerapp;

public class Song {

    // selected song from the list
    private String mSongName;

    // selected song from the list
    private String mArtist;

    // Image resource ID for the word
    private int mImageResourceId;

    // Get the song name from array list
    public Song(String name, String artist, int ImageResourceId){
        mSongName = name;
        mArtist = artist;
        mImageResourceId = ImageResourceId;
    }

    public String getTheSongName(){
        return mSongName;
    }

    public String getArtistName(){
        return mArtist;
    }

    // Get image of the song
    public int getImageResourceId() {
        return mImageResourceId;
    }

}