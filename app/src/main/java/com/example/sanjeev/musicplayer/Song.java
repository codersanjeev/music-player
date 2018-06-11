package com.example.sanjeev.musicplayer;

public class Song {
    private String song_name;
    private String artist_name;
    private String duration;
    private int play_button_id;

    public Song(String song_name, String artist_name, String duration) {
        this.song_name = song_name;
        this.artist_name = artist_name;
        this.duration = duration;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPlay_button_id() {
        return play_button_id;
    }

    public void setPlay_button_id(int play_button_id) {
        this.play_button_id = play_button_id;
    }
}
