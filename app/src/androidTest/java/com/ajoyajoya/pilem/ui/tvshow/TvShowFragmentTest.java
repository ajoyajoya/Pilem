package com.ajoyajoya.pilem.ui.tvshow;

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

public class TvShowFragmentTest {

    @Rule
    public final ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private final TvShowFragment tvShowFragment = new TvShowFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(tvShowFragment);
    }

    @Test
    public void loadTvshow() {
        onView(withId(R.id.rv_list_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_list_tv)).check(new RecyclerViewItemCountAssertion(10));
    }
}
