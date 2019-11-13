package com.ajoyajoya.pilem.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.DataPilem;

import java.util.List;

public class DetailMovieViewModel extends ViewModel {

    private MovieEntity mmovieEntity;
    private int movieId;

    private TvshowEntity mtvshowEntity;

    private final PilemRepository pilemRepository;

    public DetailMovieViewModel(PilemRepository mPilemRepository) {
        this.pilemRepository = mPilemRepository;
    }

    public MovieEntity getMovie() {
        for (int i = 0; i < DataPilem.generatePilemMovie().size(); i++) {
            MovieEntity movieEntity = DataPilem.generatePilemMovie().get(i);
            if (movieEntity.getMovieId()==movieId) {
                mmovieEntity = movieEntity;
            }
        }
        return mmovieEntity;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public TvshowEntity getTvshow() {
        for (int i = 0; i < DataPilem.generatePilemTvshow().size(); i++) {
            TvshowEntity tvshowEntity = DataPilem.generatePilemTvshow().get(i);
            if (tvshowEntity.getTvId()==movieId) {
                mtvshowEntity = tvshowEntity;
            }
        }
        return mtvshowEntity;
    }

    public void setTvshowId(int movieId) {
        this.movieId = movieId;
    }

    LiveData<List<DetailMovieEntity>> getMoviesDetail() {
        return pilemRepository.getDetailMovies(movieId);

    }

    LiveData<List<DetailMovieEntity>> getTviesDetail() {
        return pilemRepository.getDetailTvies(movieId);

    }

}
