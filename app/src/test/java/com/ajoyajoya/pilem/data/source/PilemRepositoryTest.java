package com.ajoyajoya.pilem.data.source;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.ajoyajoya.pilem.data.DetailMovieItems;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.remote.RemoteRepository;
import com.ajoyajoya.pilem.data.source.remote.response.MovieResponse;
import com.ajoyajoya.pilem.data.source.remote.response.TvshowResponse;
import com.ajoyajoya.pilem.utils.FakeDataPilemDummy;
import com.ajoyajoya.pilem.utils.LiveDataTestUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class PilemRepositoryTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private RemoteRepository remote = Mockito.mock(RemoteRepository.class);
    private FakePilemRepository pilemRepository = new FakePilemRepository(remote);

    private List<MovieResponse> movieResponses = FakeDataPilemDummy.generateRemoteDummyMovie();
    private List<TvshowResponse> tvshowResponses = FakeDataPilemDummy.generateRemoteDummyTvShow();

    private int movieId = movieResponses.get(0).getMovieId();
    private ArrayList<DetailMovieItems> detailMovieResponses = FakeDataPilemDummy.generateRemoteDetailMovie(movieId);

    private int tvId = tvshowResponses.get(0).getTvId();
    private ArrayList<DetailMovieItems> detailTvResponses = FakeDataPilemDummy.generateRemoteDetailTv(tvId);


    @SuppressWarnings("EmptyMethod")
    @Before
    public void setUp() {

    }

    @SuppressWarnings("EmptyMethod")
    @After
    public void tearDown() {

    }


    @Test
    public void getAllMovies() {
        doAnswer(invocation -> {
            ((RemoteRepository.LoadMoviesCallback) invocation.getArguments()[0])
                    .onAllMoviesReceived(movieResponses);
            return null;
        }).when(remote).getAllMovies(any(RemoteRepository.LoadMoviesCallback.class));

        List<MovieEntity> result = LiveDataTestUtil.getValue(pilemRepository.getAllMovies());

        verify(remote, times(1)).getAllMovies(any(RemoteRepository.LoadMoviesCallback.class));

        assertNotNull(result);
        assertEquals(movieResponses.size(), result.size());

    }

    @Test
    public void getAllTvies() {
        doAnswer(invocation -> {
            ((RemoteRepository.LoadTviesCallback) invocation.getArguments()[0])
                    .onAllTviesReceived(tvshowResponses);
            return null;
        }).when(remote).getAllTvies(any(RemoteRepository.LoadTviesCallback.class));

        List<TvshowEntity> result = LiveDataTestUtil.getValue(pilemRepository.getAllTvies());

        verify(remote, times(1)).getAllTvies(any(RemoteRepository.LoadTviesCallback.class));

        assertNotNull(result);
        assertEquals(tvshowResponses.size(), result.size());

    }

    @Test
    public void getMoviesById(){
        doAnswer(invocation -> {
            ((RemoteRepository.LoadDetailMoviesCallback) invocation.getArguments()[1])
                    .onAllMoviesReceived(detailMovieResponses);
            return null;
        }).when(remote).getDetailMovies(eq(movieId), any(RemoteRepository.LoadDetailMoviesCallback.class));

        List<DetailMovieEntity> result = LiveDataTestUtil.getValue(pilemRepository.getDetailMovies(movieId));

        verify(remote, times(1)).getDetailMovies(eq(movieId), any(RemoteRepository.LoadDetailMoviesCallback.class));

        assertNotNull(result);
        assertEquals(detailMovieResponses.size(), result.size());
    }

    @Test
    public void getTviesById(){
        doAnswer(invocation -> {
            ((RemoteRepository.LoadDetailTviesCallback) invocation.getArguments()[1])
                    .onAllTviesReceived(detailTvResponses);
            return null;
        }).when(remote).getDetailTvies(eq(tvId), any(RemoteRepository.LoadDetailTviesCallback.class));

        List<DetailMovieEntity> result = LiveDataTestUtil.getValue(pilemRepository.getDetailTvies(tvId));

        verify(remote, times(1)).getDetailTvies(eq(tvId), any(RemoteRepository.LoadDetailTviesCallback.class));

        assertNotNull(result);
        assertEquals(detailTvResponses.size(), result.size());
    }

}