package com.ajoyajoya.pilem.ui.movie;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.FakeDataPilemDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MovieViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private MovieViewModel viewModel;
    private PilemRepository pilemRepository = mock(PilemRepository.class);


    @Before
    public void setUp() {
        //viewModel = new MovieViewModel();
        viewModel = new MovieViewModel(pilemRepository);
    }

    @Test
    public void getMovies() {

        List<MovieEntity> movieEntities = FakeDataPilemDummy.generatePilemMovie();

        MutableLiveData<List<MovieEntity>> movies = new MutableLiveData<>();
        movies.setValue(movieEntities);

        when(pilemRepository.getAllMovies()).thenReturn(movies);

        Observer<List<MovieEntity>> observer = mock(Observer.class);

        viewModel.getMoviesAll().observeForever(observer);

        verify(observer).onChanged(movieEntities);

        assertNotNull(movieEntities);
        assertEquals(10, movieEntities.size());

    }


}