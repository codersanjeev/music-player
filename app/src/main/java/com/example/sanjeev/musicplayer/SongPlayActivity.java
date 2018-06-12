package com.example.sanjeev.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SongPlayActivity extends AppCompatActivity {

    private TextView song_name, artist_name;
    private String current_song_name, current_artist_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);

        Intent in = getIntent();

        song_name = findViewById(R.id.song_name_display);
        artist_name = findViewById(R.id.artist_name_display);
        current_song_name = in.getStringExtra("SONG_NAME");
        current_artist_name = in.getStringExtra("ARTIST_NAME");
        song_name.setText(current_song_name);
        artist_name.setText(current_artist_name);

    }

    public void PreviousSong(View view) {
        Toast.makeText(this,  "Previous Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void NextSong(View view) {
        Toast.makeText(this, "Next Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void PlaySong(View view) {
        Toast.makeText(this, "Current Song is being played/paused", Toast.LENGTH_SHORT).show();
    }
}
