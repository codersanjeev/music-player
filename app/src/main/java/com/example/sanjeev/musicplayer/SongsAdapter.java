package com.example.sanjeev.musicplayer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.MyViewHolder>{
    private List<Song> songsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView song, artist, length;
        public MyViewHolder(View view){
            super(view);
            song = view.findViewById(R.id.song_name);
            artist = view.findViewById(R.id.artist_name);
            length = view.findViewById(R.id.duration);
        }
    }
    public SongsAdapter(List<Song> songsList){
        this.songsList = songsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.song_list_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Song song = songsList.get(position);
        holder.song.setText(song.getSong_name());
        holder.artist.setText(song.getArtist_name());
        holder.length.setText(song.getDuration());
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }


}
