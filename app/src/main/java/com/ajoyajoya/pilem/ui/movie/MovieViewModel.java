package com.ajoyajoya.pilem.ui.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.DataPilem;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private PilemRepository pilemRepository;

    public MovieViewModel(PilemRepository mPilemRepository) {
        this.pilemRepository = mPilemRepository;
    }

//    public List<MovieEntity> getAllMovies(){
//        return pilemRepository.getAllMovies();
//    }

    public List<MovieEntity> getMovies() {
        return DataPilem.generatePilemMovie();
    }

    LiveData<List<MovieEntity>> getMoviesAll() {
        return pilemRepository.getAllMovies();

    }
}
