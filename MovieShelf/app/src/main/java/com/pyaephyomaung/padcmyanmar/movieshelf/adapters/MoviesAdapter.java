package com.pyaephyomaung.padcmyanmar.movieshelf.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyaephyomaung.padcmyanmar.movieshelf.R;
import com.pyaephyomaung.padcmyanmar.movieshelf.viewholders.MovieItemsViewHolder;

import java.util.zip.Inflater;

/**
 * Created by V3-575G on 09-12-2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater =  LayoutInflater.from(context);
        View MovieItemsView = inflater.inflate(R.layout.item_movies,parent,false);
        MovieItemsViewHolder MovieItemViewHolder = new MovieItemsViewHolder(MovieItemsView);
        return MovieItemViewHolder;



    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
