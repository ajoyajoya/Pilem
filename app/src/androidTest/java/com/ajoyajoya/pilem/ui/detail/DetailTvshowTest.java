package com.ajoyajoya.pilem.ui.detail;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.utils.FakeDataPilem;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailTvshowTest {

    private final TvshowEntity dummyTvshow = FakeDataPilem.generatePilemTvshow().get(0);



    @Rule
    public ActivityTestRule<DetailMovie> activityRuleTv = new ActivityTestRule<DetailMovie>(DetailMovie.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailMovie.class);
            result.putExtra(DetailMovie.EXTRA_MOVIE, dummyTvshow.getTvId());
            return result;
        }
    };



    @Test
    public void loadTvshow() {
        onView(withId(R.id.txt_movie_name)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_name)).check(matches(withText(dummyTvshow.getTvName())));

        onView(withId(R.id.txt_movie_rate)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_rate)).check(matches(withText(dummyTvshow.getTvRated())));

        onView(withId(R.id.txt_movie_cat)).check(matches(isDisplayed()));
        onView(withId(R.id.txt_movie_cat)).check(matches(withText(dummyTvshow.getTvCategory())));

        onView(withId(R.id.img_poster_movie)).check(matches(isDisplayed()));

        onView(withId(R.id.bg_movie_detail)).check(matches(isDisplayed()));

        onView(withId(R.id.img_trailer_link)).check(matches(isDisplayed()));

        onView(withId(R.id.txt_movie_desc)).check(matches(withText(dummyTvshow.getTvDesc())));


    }
}
