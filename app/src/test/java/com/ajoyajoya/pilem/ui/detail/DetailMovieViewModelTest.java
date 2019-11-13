package com.ajoyajoya.pilem.ui.detail;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.ajoyajoya.pilem.data.source.PilemRepository;
import com.ajoyajoya.pilem.utils.FakeDataPilemDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DetailMovieViewModelTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private DetailMovieViewModel viewModel;

    private PilemRepository pilemRepository = mock(PilemRepository.class);

    private MovieEntity dummyMovie = FakeDataPilemDummy.generatePilemMovie().get(0);
    private int movieId = dummyMovie.getMovieId();
    private DetailMovieEntity dummyDetailMovieEntity;
    private List<DetailMovieEntity> dummyDetailMovies = FakeDataPilemDummy.generatePilemDetailMovie(movieId);

    private TvshowEntity dummyTvshow = FakeDataPilemDummy.generatePilemTvshow().get(0);
    private int tvShowId = dummyTvshow.getTvId();
    private DetailMovieEntity dummyDetailTvEntity;
    private ArrayList<DetailMovieEntity> dummyDetailTvies = FakeDataPilemDummy.generatePilemDetailTvshow(tvShowId);

    @Before
    public void setUp() {

        viewModel = new DetailMovieViewModel(pilemRepository);
        viewModel.setMovieId(movieId);
        dummyDetailMovieEntity = new DetailMovieEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01",
                "Tim Miller",
                "James Cameron",
                "Director",
                "Producer",
                "8CjYw1hARhY",
                "YouTube"
        );

    }

    @Before
    public void setUp1() {
        viewModel = new DetailMovieViewModel(pilemRepository);
        viewModel.setTvshowId(tvShowId);
        dummyDetailTvEntity = new DetailMovieEntity(
                290859,
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "https://image.tmdb.org/t/p/w500/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg",
                "Terminator: Dark Fate",
                "6.5",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "More than two decades have passed since Sarah Connor prevented Judgment Day, changed the future, and re-wrote the fate of the human race. Dani Ramos is living a simple life in Mexico City with her brother and father when a highly advanced and deadly new Terminator – a Rev-9 – travels back through time to hunt and kill her. Dani's survival depends on her joining forces with two warriors: Grace, an enhanced super-soldier from the future, and a battle-hardened Sarah Connor. As the Rev-9 ruthlessly destroys everything and everyone in its path on the hunt for Dani, the three are led to a T-800 from Sarah’s past that may be their last best hope.",
                "2019-11-01",
                "Tim Miller",
                "James Cameron",
                "Director",
                "Producer",
                "8CjYw1hARhY",
                "YouTube"
        );

    }

    @Test
    public void getDetailMovies() {
        MutableLiveData<List<DetailMovieEntity>> detailMovieEntities = new MutableLiveData<>();
        detailMovieEntities.setValue(dummyDetailMovies);

        when(pilemRepository.getDetailMovies(movieId)).thenReturn(detailMovieEntities);

        Observer<List<DetailMovieEntity>> observer = mock(Observer.class);
        viewModel.getMoviesDetail().observeForever(observer);

        verify(observer).onChanged(dummyDetailMovies);

        assertNotNull(detailMovieEntities);
        assertEquals(Objects.requireNonNull(detailMovieEntities.getValue()).get(0).getMovieId(), dummyDetailMovieEntity.getMovieId());
        assertEquals(detailMovieEntities.getValue().get(0).getMoviePoster(), dummyDetailMovieEntity.getMoviePoster());
        assertEquals(detailMovieEntities.getValue().get(0).getMovieName(), dummyDetailMovieEntity.getMovieName());
        assertEquals(detailMovieEntities.getValue().get(0).getMovieRated(), dummyDetailMovieEntity.getMovieRated());
        assertEquals(detailMovieEntities.getValue().get(0).getMovieCategory(), dummyDetailMovieEntity.getMovieCategory());
        assertEquals(detailMovieEntities.getValue().get(0).getMovieDesc(), dummyDetailMovieEntity.getMovieDesc());
    }


    @Test
    public void getDetailTvshow() {
        MutableLiveData<List<DetailMovieEntity>> detailTvEntities = new MutableLiveData<>();
        detailTvEntities.setValue(dummyDetailTvies);

        when(pilemRepository.getDetailTvies(movieId)).thenReturn(detailTvEntities);

        Observer<List<DetailMovieEntity>> observer = mock(Observer.class);
        viewModel.getTviesDetail().observeForever(observer);

        verify(observer).onChanged(dummyDetailTvies);

        assertNotNull(detailTvEntities);
        assertEquals(Objects.requireNonNull(detailTvEntities.getValue()).get(0).getMovieId(), dummyDetailTvEntity.getMovieId());
        assertEquals(detailTvEntities.getValue().get(0).getMoviePoster(), dummyDetailTvEntity.getMoviePoster());
        assertEquals(detailTvEntities.getValue().get(0).getMovieName(), dummyDetailTvEntity.getMovieName());
        assertEquals(detailTvEntities.getValue().get(0).getMovieRated(), dummyDetailTvEntity.getMovieRated());
        assertEquals(detailTvEntities.getValue().get(0).getMovieCategory(), dummyDetailTvEntity.getMovieCategory());
        assertEquals(detailTvEntities.getValue().get(0).getMovieDesc(), dummyDetailTvEntity.getMovieDesc());
    }

}