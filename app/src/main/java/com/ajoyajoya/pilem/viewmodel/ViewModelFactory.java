package com.ajoyajoya.pilem.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.di.Injection;
import com.ajoyajoya.pilem.ui.detail.DetailMovieViewModel;
import com.ajoyajoya.pilem.ui.movie.MovieViewModel;
import com.ajoyajoya.pilem.ui.tvshow.TvShowViewModel;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory  {

    private static volatile ViewModelFactory INSTANCE;

    private final PilemRepository mPilemRepository;

    private ViewModelFactory(PilemRepository pilemRepository) {
        mPilemRepository = pilemRepository;
    }

    public static ViewModelFactory getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (ViewModelFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ViewModelFactory(Injection.provideRepository(application));
                }
            }
        }
        return INSTANCE;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        if (modelClass.isAssignableFrom(MovieViewModel.class)) {
            //noinspection unchecked
            return (T) new MovieViewModel(mPilemRepository);
        } else if (modelClass.isAssignableFrom(TvShowViewModel.class)) {
            //noinspection unchecked
            return (T) new TvShowViewModel(mPilemRepository);
        } else if (modelClass.isAssignableFrom(DetailMovieViewModel.class)){
            return (T) new DetailMovieViewModel(mPilemRepository);
        }

        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }


}
