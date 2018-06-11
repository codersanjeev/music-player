package com.example.sanjeev.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SongPlayActivity extends AppCompatActivity {

    TextView currentSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);
        currentSong = findViewById(R.id.song_name);
        Intent intent = getIntent();
        String song_name = intent.getStringExtra("SONG_NAME");
        currentSong.setText(String.format("%s is being played", song_name));

    }
}
