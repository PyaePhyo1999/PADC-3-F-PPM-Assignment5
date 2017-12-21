package com.pyaephyomaung.padcmyanmar.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.pyaephyomaung.padcmyanmar.movieshelf.Delegate.MoviesActionDelegate;
import com.pyaephyomaung.padcmyanmar.movieshelf.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by V3-575G on 09-12-2017.
 */

public class MovieItemsViewHolder extends RecyclerView.ViewHolder {
    private MoviesActionDelegate mMovieActionDelegate;
    public MovieItemsViewHolder(View itemView, MoviesActionDelegate mMovieActionDelegate) {
        super(itemView);
        this.mMovieActionDelegate = mMovieActionDelegate;
        ButterKnife.bind(this,itemView);
    }



    @OnClick(R.id.cv_movies_item)
    public void onTapItemView(View view){
        mMovieActionDelegate.onTapItemView();

    }

}
