package com.example.sanjeev.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SongPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_play);

        // Receive song details to be played and display them
        Intent in = getIntent();

        TextView song_name = findViewById(R.id.song_name_display);
        TextView artist_name = findViewById(R.id.artist_name_display);
        song_name.setText(in.getStringExtra("SONG_NAME"));
        artist_name.setText(in.getStringExtra("ARTIST_NAME"));

    }

    public void PreviousSong(View view) {
        // Implementation to play previous song
        Toast.makeText(this, "Previous Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void NextSong(View view) {
        // Implementation to play next song
        Toast.makeText(this, "Next Song will be played", Toast.LENGTH_SHORT).show();
    }

    public void PlaySong(View view) {
        // Implementation to play/pause currently playing song
        Toast.makeText(this, "Current Song is being played/paused", Toast.LENGTH_SHORT).show();
    }
}
