package com.example.fitrecipe;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class HealthActivityTest {

    @Rule
    public ActivityScenarioRule<HealthActivity> activityScenarioRule = new ActivityScenarioRule<>(HealthActivity.class);

    @Test
    public void testViewsDisplayed() {
        // Check if BMI value TextView is displayed
        Espresso.onView(withId(R.id.bmi_display)).check(matches(isDisplayed()));

        // Check if Suggested Foods TextView is displayed
        Espresso.onView(withId(R.id.suggested_food_text)).check(matches(isDisplayed()));

        // Check if Recipe Button is displayed
        Espresso.onView(withId(R.id.recipeButton)).check(matches(isDisplayed()));
    }


}
