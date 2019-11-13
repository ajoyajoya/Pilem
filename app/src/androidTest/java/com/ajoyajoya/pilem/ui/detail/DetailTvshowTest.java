package com.ajoyajoya.pilem.ui.detail;

import android.content.Context;
import android.content.Intent;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.ajoyajoya.pilem.utils.EspressoIdlingResource;
import com.ajoyajoya.pilem.utils.FakeDataPilem;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class DetailTvshowTest {

    private final ArrayList<DetailMovieEntity> dummyTvshow = FakeDataPilem.generatePilemDetailTvshow(290859);


    @Rule
    public ActivityTestRule<DetailMovie> activityRuleTv = new ActivityTestRule<DetailMovie>(DetailMovie.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailMovie.class);
            result.putExtra(DetailMovie.EXTRA_MOVIE, "t"+dummyTvshow.get(0).getMovieId());
            return result;
        }
    };

    @Before
    public void setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource());
    }

    @After
    public void tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource());
    }



    @Test
    public void loadDetailTvshow() {

        onView(withId(R.id.txt_movie_name)).check(matches(isDisplayed()));

        onView(withId(R.id.txt_movie_rate)).check(matches(isDisplayed()));

        onView(withId(R.id.img_poster_movie)).check(matches(isDisplayed()));

        onView(withId(R.id.img_trailer_link)).check(matches(isDisplayed()));
//        onView(withId(R.id.rv_list_pilem)).check(matches(isDisplayed()));
//        onView(withId(R.id.txt_movie_name)).check(matches(withText(dummyTvshow.get(0).getMovieName())));

//        onView(withId(R.id.txt_movie_rate)).check(matches(isDisplayed()));

//        onView(withId(R.id.img_poster_movie)).check(matches(isDisplayed()));

//        onView(withId(R.id.img_trailer_link)).check(matches(isDisplayed()));

//        onView(withId(R.id.txt_movie_name)).check(matches(isDisplayed()));
//        onView(withId(R.id.txt_movie_name)).check(matches(withText(dummyTvshow.get(0).getMovieName())));
//
//        onView(withId(R.id.txt_movie_rate)).check(matches(isDisplayed()));
//        onView(withId(R.id.txt_movie_rate)).check(matches(withText(dummyTvshow.get(0).getMovieRated())));
//
//        onView(withId(R.id.txt_movie_cat)).check(matches(isDisplayed()));
//        onView(withId(R.id.txt_movie_cat)).check(matches(withText(dummyTvshow.get(0).getMovieCategory())));
//
//        onView(withId(R.id.img_poster_movie)).check(matches(isDisplayed()));
//
//        onView(withId(R.id.bg_movie_detail)).check(matches(isDisplayed()));
//
//        onView(withId(R.id.img_trailer_link)).check(matches(isDisplayed()));
//
//        onView(withId(R.id.txt_movie_desc)).check(matches(withText(dummyTvshow.get(0).getMovieDesc())));
//

    }
}
