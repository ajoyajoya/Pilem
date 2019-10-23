package com.ajoyajoya.pilem.ui.movie;

import androidx.test.rule.ActivityTestRule;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.testing.SingleFragmentActivity;
import com.ajoyajoya.pilem.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MovieFragmentTest {

    @Rule
    public final ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private final MovieFragment movieFragment = new MovieFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(movieFragment);
    }

    @Test
    public void loadMovies() {
        onView(withId(R.id.rv_list_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_list_movie)).check(new RecyclerViewItemCountAssertion(10));
    }

}