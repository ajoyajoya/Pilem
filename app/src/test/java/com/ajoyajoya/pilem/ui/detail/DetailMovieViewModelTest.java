package com.ajoyajoya.pilem.ui.detail;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.data.TvshowEntity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetailMovieViewModelTest {

    private DetailMovieViewModel viewModel;
    private MovieEntity dummyMovie;
    private TvshowEntity dummyTvshow;

    @Before
    public void setUp() {
        viewModel = new DetailMovieViewModel();
        dummyMovie = new MovieEntity(
                "m1",
                R.drawable.poster_a_star,
                "A Star is Born (2018)",
                "7.8",
                "R | 2h 16min | Drama, Music, Romance | 5 October 2018 (USA)",
                "A musician helps a young singer find fame as age and alcoholism send his own career into a downward spiral. \n Seasoned musician Jackson Maine (Bradley Cooper) discovers-and falls in love with-struggling artist Ally (Gaga). She has just about given up on her dream to make it big as a singer - until Jack coaxes her into the spotlight. But even as Ally s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.");
    }

    @Before
    public void setUp1() {
        viewModel = new DetailMovieViewModel();
        dummyTvshow = new TvshowEntity(
                "tv1",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Arrow (2012)",
                "7.6",
                "TV-14 | 42min | Action, Adventure, Crime | TV Series (2012– )",
                R.drawable.tv_poster_arrow);
    }

    @Test
    public void getMovies() {
        viewModel.setMovieId(dummyMovie.getMovieId());
        MovieEntity movieEntity = viewModel.getMovie();
        assertNotNull(movieEntity);
        assertEquals(dummyMovie.getMovieId(), movieEntity.getMovieId());
        assertEquals(dummyMovie.getMoviePoster(), movieEntity.getMoviePoster());
        assertEquals(dummyMovie.getMovieName(), movieEntity.getMovieName());
        assertEquals(dummyMovie.getMovieRated(), movieEntity.getMovieRated());
        assertEquals(dummyMovie.getMovieCategory(), movieEntity.getMovieCategory());
        assertEquals(dummyMovie.getMovieDesc(), movieEntity.getMovieDesc());
    }

    @Test
    public void getTvshow() {
        viewModel.setMovieId(dummyTvshow.getTvId());
        TvshowEntity tvshowEntity = viewModel.getTvshow();
        assertNotNull(tvshowEntity);
        assertEquals(dummyTvshow.getTvId(), tvshowEntity.getTvId());
        assertEquals(dummyTvshow.getTvPoster(), tvshowEntity.getTvPoster());
        assertEquals(dummyTvshow.getTvName(), tvshowEntity.getTvName());
        assertEquals(dummyTvshow.getTvRated(), tvshowEntity.getTvRated());
        assertEquals(dummyTvshow.getTvCategory(), tvshowEntity.getTvCategory());
        assertEquals(dummyTvshow.getTvDesc(), tvshowEntity.getTvDesc());
    }

}