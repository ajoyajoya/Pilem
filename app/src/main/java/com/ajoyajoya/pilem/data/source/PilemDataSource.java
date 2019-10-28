package com.ajoyajoya.pilem.data.source;

import androidx.lifecycle.LiveData;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;

import java.util.List;

public interface PilemDataSource {

    LiveData<List<MovieEntity>> getAllMovies();

    LiveData<List<TvshowEntity>> getAllTvies();

}
