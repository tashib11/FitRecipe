package com.example.fitrecipe;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(AndroidJUnit4.class)
public class AgeCalculatorSingletonInstrumentedTest {
    @Rule
    public ActivityScenarioRule<AgeCalculate> activityRule = new ActivityScenarioRule<>(AgeCalculate.class);

    @Test
    public void testCalculateAge() {
        onView(withId(R.id.dayEditText)).perform(replaceText("10"));
        onView(withId(R.id.monthEditText)).perform(replaceText("5"));
        onView(withId(R.id.yearEditText)).perform(replaceText("1990"));

        onView(withId(R.id.calculateButton)).perform(click());

        onView(withId(R.id.ageTextView)).check(matches(withText("Your age is: 34 years, 0 months, and 12 days")));
    }





}