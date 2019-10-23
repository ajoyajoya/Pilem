package com.ajoyajoya.pilem.ui.movie;

import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.utils.DataPilem;

import java.util.List;

public class MovieViewModel extends ViewModel {
    public List<MovieEntity> getMovies() {
        return DataPilem.generatePilemMovie();
    }
}
