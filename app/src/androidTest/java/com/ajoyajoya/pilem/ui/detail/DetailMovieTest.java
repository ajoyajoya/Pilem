package com.ajoyajoya.pilem.ui.detail;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.MovieEntity;
import com.ajoyajoya.pilem.utils.FakeDataPilem;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailMovieTest {

    private final MovieEntity dummyMovie = FakeDataPilem.generatePilemMovie().get(0);


    @Rule
    public ActivityTestRule<DetailMovie> activityRule = new ActivityTestRule<DetailMovie>(DetailMovie.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailMovie.class);
            result.putExtra(DetailMovie.EXTRA_MOVIE, dummyMovie.getMovieId());
            return result;
        }
    };


    @Test
    public void loadMovie() {
        onView(withId(R.id.txt_movie_name)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_name)).check(matches(withText(dummyMovie.getMovieName())));

        onView(withId(R.id.txt_movie_rate)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_rate)).check(matches(withText(dummyMovie.getMovieRated())));

        onView(withId(R.id.txt_movie_cat)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_cat)).check(matches(withText(dummyMovie.getMovieCategory())));

        onView(withId(R.id.img_poster_movie)).check(matches(isDisplayed()));

        onView(withId(R.id.bg_movie_detail)).check(matches(isDisplayed()));

        onView(withId(R.id.img_trailer_link)).check(matches(isDisplayed()));

        onView(withId(R.id.txt_movie_desc)).check(matches(withText(dummyMovie.getMovieDesc())));


    }


}