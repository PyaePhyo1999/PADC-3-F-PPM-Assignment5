package com.pyaephyomaung.padcmyanmar.movieshelf.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import com.pyaephyomaung.padcmyanmar.movieshelf.R;
import com.pyaephyomaung.padcmyanmar.movieshelf.adapters.TrailersAdapter;

import java.util.concurrent.ThreadPoolExecutor;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by V3-575G on 14-12-2017.
 */

public class MovieDetailsActivity extends AppCompatActivity {
    @BindView(R.id.rv_movie_trailer)
    RecyclerView rvMovieTrailer;
    private TrailersAdapter mTrailersAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_movie_details);
        ButterKnife.bind(this,this);
        mTrailersAdapter = new TrailersAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvMovieTrailer.setAdapter(mTrailersAdapter);
        rvMovieTrailer.setLayoutManager(linearLayoutManager);
    }
}
