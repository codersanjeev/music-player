package com.example.sanjeev.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Song> songsList = new ArrayList<>();
    SongsAdapter mAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.songs_list_view);
        // Custom Adapter
        mAdapter = new SongsAdapter(songsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        // OnClick on a song fromm the list
        recyclerView.addOnItemTouchListener(new RecyclerClickListner(getApplicationContext(), recyclerView, new RecyclerClickListner.ClickListener() {
            // Single Click
            @Override
            public void onClick(View view, int position) {
                // Launch the song player activity
                Song song = songsList.get(position);
                Intent intent = new Intent(getApplicationContext(), SongPlayActivity.class);
                // pass the song information to be played
                intent.putExtra("SONG_NAME", song.getSong_name());
                intent.putExtra("ARTIST_NAME", song.getArtist_name());
                startActivity(intent);
            }


            @Override
            public void onLongClick(View view, int position) {
                // Do nothing for now
            }
        }));

        recyclerView.setAdapter(mAdapter);
        prepareSongsData();
    }

    private void prepareSongsData() {
        songsList.add(new Song("Wake me up", "Avicii", "03:10"));
        songsList.add(new Song("Lean On", "DJ Snake", "03:50"));
        songsList.add(new Song("Don't Let Me Down", "The Chainsmokers", "02:49"));
        songsList.add(new Song("One Kiss", "Dua Lipa", "03:01"));
        songsList.add(new Song("Sandstorm", "Darude", "01:11"));
        songsList.add(new Song("Something just like this", "Coldplay", "02:12"));
        songsList.add(new Song("Cinema", "Benni Benassi", "03:22"));
        songsList.add(new Song("Closer", "The Chainsmokers", "01:17"));
        songsList.add(new Song("Tsunami", "DVBBS", "02:53"));
        songsList.add(new Song("Animals", "Martin Garrix", "03:34"));
        songsList.add(new Song("Get Lucky", "Daft Punk", "02:44"));
        songsList.add(new Song("Clarity", "Zedd", "01:50"));
        songsList.add(new Song("Flames", "Sia", "04:10"));
        songsList.add(new Song("The Middle", "Maren Morris", "02:47"));
        songsList.add(new Song("Turn down for what", "Lil Jon", "01:04"));
        songsList.add(new Song("Body Talk", "Dimitri Vegas", "02:01"));
        songsList.add(new Song("The Days", "Avicii", "03:58"));
        songsList.add(new Song("Heroes", "Alesso", "02:45"));
        songsList.add(new Song("Roses", "The Chainsmokers", "02:37"));
        songsList.add(new Song("Cold Water", "Major Lazer", "03:19"));
        mAdapter.notifyDataSetChanged();
    }
}
