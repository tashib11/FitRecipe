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
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class HeightConverterInstrumentedTest {
    @Rule
    public ActivityScenarioRule<HeightConverter> activityRule = new ActivityScenarioRule<>(HeightConverter.class);

    @Test
    public void testConvertMetersToInches() {
        onView(withId(R.id.editTextValue)).perform(replaceText("1"));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Meters")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Inches")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("1.0 Meters is 39.37 Inches.")));
    }

    @Test
    public void testConvertMilesToKilometers() {
        onView(withId(R.id.editTextValue)).perform(replaceText("1"));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Miles")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Kilometers")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("1.0 Miles is 1.61 Kilometers.")));
    }

    @Test
    public void testConvertFeetToCentimeters() {
        onView(withId(R.id.editTextValue)).perform(replaceText("1"));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Feet")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Centimeters")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("1.0 Feet is 30.48 Centimeters.")));
    }

    @Test
    public void testConvertInchesToMeters() {
        onView(withId(R.id.editTextValue)).perform(replaceText("1"));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Inches")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Meters")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("1.0 Inches is 0.03 Meters.")));
    }

    @Test
    public void testEmptyInputValue() {
        onView(withId(R.id.editTextValue)).perform(replaceText(""));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Meters")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Inches")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Please enter a value.")));
    }

    @Test
    public void testInvalidInputValue() {
        onView(withId(R.id.editTextValue)).perform(replaceText("abc"));

        onView(withId(R.id.spinnerFromUnit)).perform(click());
        onView(withText("Meters")).perform(click());

        onView(withId(R.id.spinnerToUnit)).perform(click());
        onView(withText("Inches")).perform(click());

        onView(withId(R.id.buttonConvert)).perform(click());

        onView(withId(R.id.textViewResult)).check(matches(withText("Invalid input value.")));
    }


}