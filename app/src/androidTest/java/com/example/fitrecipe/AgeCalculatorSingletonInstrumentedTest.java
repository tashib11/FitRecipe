package com.example.fitrecipe;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
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
    public void testCalculateAgeButton_withValidInput() {
        // Enter valid date
        Espresso.onView(ViewMatchers.withId(R.id.dayEditText)).perform(ViewActions.typeText("1"));
        Espresso.onView(ViewMatchers.withId(R.id.monthEditText)).perform(ViewActions.typeText("1"));
        Espresso.onView(ViewMatchers.withId(R.id.yearEditText)).perform(ViewActions.typeText("2000"));

        // Close the keyboard
        Espresso.closeSoftKeyboard();

        // Click the calculate button
        Espresso.onView(ViewMatchers.withId(R.id.calculateButton)).perform(ViewActions.click());

        // Check if the age is displayed
        Espresso.onView(ViewMatchers.withId(R.id.ageTextView)).check(ViewAssertions.matches(ViewMatchers.withText("Your age is: 24 years, 4 months, and 21 days")));
    }






}