package com.example.sanjeev.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

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
        mAdapter = new SongsAdapter(songsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.addOnItemTouchListener(new RecyclerClickListner(getApplicationContext(), recyclerView, new RecyclerClickListner.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Song song = songsList.get(position);
                Toast.makeText(getApplicationContext(), song.getSong_name() + " is selected!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), SongPlayActivity.class);
                intent.putExtra("SONG_NAME", song.getSong_name());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Long Click", Toast.LENGTH_LONG).show();

            }
        }));

        recyclerView.setAdapter(mAdapter);

        prepareSongsData();
    }

    private void prepareSongsData() {
        songsList.add(new Song("Wake me up", "Avicii", "03:10"));
        songsList.add(new Song("Lean On", "DJ Snake", "03:10"));
        songsList.add(new Song("Don't Let Me Down", "The Chainsmokers", "03:10"));
        songsList.add(new Song("One Kiss", "Dua Lipa", "03:10"));
        songsList.add(new Song("Sandstorm", "Darude", "03:10"));
        songsList.add(new Song("Something just like this", "Coldplay", "03:10"));
        songsList.add(new Song("Cinema", "Benni Benassi", "03:10"));
        songsList.add(new Song("Closer", "The Chainsmokers", "03:10"));
        songsList.add(new Song("Tsunami", "DVBBS", "03:10"));
        songsList.add(new Song("Animals", "Martin Garrix", "03:10"));
        songsList.add(new Song("Get Lucky", "Daft Punk", "03:10"));
        songsList.add(new Song("Clarity", "Zedd", "03:10"));
        songsList.add(new Song("Flames", "Sia", "03:10"));
        songsList.add(new Song("The Middle", "Maren Morris", "03:10"));
        songsList.add(new Song("Turn down for what", "Lil Jon", "03:10"));
        songsList.add(new Song("Body Talk", "Dimitri Vegas", "03:10"));
        songsList.add(new Song("The Days", "Avicii", "03:10"));
        songsList.add(new Song("Heroes", "Alesso", "03:10"));
        songsList.add(new Song("Roses", "The Chainsmokers", "03:10"));
        songsList.add(new Song("Cold Water", "Major Lazer", "03:10"));
        mAdapter.notifyDataSetChanged();
    }
}
