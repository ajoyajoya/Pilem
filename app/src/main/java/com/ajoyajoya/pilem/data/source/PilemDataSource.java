package com.ajoyajoya.pilem.data.source;

import androidx.lifecycle.LiveData;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public interface PilemDataSource {

    LiveData<List<MovieEntity>> getAllMovies();

    LiveData<List<TvshowEntity>> getAllTvies();

    LiveData<List<DetailMovieEntity>> getDetailMovies(int idMovie);

    LiveData<List<DetailMovieEntity>> getDetailTvies(int idMovie);

}
