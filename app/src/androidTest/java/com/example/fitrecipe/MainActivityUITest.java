package com.example.fitrecipe;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void recyclerViewIsDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView_id))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void recyclerViewHasItems() {
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView_id))
                .check(ViewAssertions.matches(ViewMatchers.hasMinimumChildCount(1)));
    }
}
