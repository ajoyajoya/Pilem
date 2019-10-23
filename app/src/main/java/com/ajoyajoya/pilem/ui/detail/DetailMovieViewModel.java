package com.ajoyajoya.pilem.ui.detail;

import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.utils.DataPilem;

public class DetailMovieViewModel extends ViewModel {

    private MovieEntity mmovieEntity;
    private String movieId;

    private TvshowEntity mtvshowEntity;

    public MovieEntity getMovie() {
        for (int i = 0; i < DataPilem.generatePilemMovie().size(); i++) {
            MovieEntity movieEntity = DataPilem.generatePilemMovie().get(i);
            if (movieEntity.getMovieId().equals(movieId)) {
                mmovieEntity = movieEntity;
            }
        }
        return mmovieEntity;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public TvshowEntity getTvshow() {
        for (int i = 0; i < DataPilem.generatePilemTvshow().size(); i++) {
            TvshowEntity tvshowEntity = DataPilem.generatePilemTvshow().get(i);
            if (tvshowEntity.getTvId().equals(movieId)) {
                mtvshowEntity = tvshowEntity;
            }
        }
        return mtvshowEntity;
    }

    public void setTvshowId(String movieId) {
        this.movieId = movieId;
    }

}
