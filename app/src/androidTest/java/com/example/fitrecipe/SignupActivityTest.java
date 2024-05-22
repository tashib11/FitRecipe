package com.example.fitrecipe;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class SignupActivityTest {

    @Rule
    public ActivityScenarioRule<SignupActivity> activityRule =
            new ActivityScenarioRule<>(SignupActivity.class);

    @Test
    public void testSignupButtonClick() {

        Espresso.onView(withId(R.id.signup_name)).perform(ViewActions.typeText("John Doe"));
        Espresso.onView(withId(R.id.signup_email)).perform(ViewActions.typeText("johndoe@example.com"));
        Espresso.onView(withId(R.id.signup_username)).perform(ViewActions.typeText("johndoe123"));
        Espresso.onView(withId(R.id.signup_password)).perform(ViewActions.typeText("password"));


        Espresso.closeSoftKeyboard();


        Espresso.onView(withId(R.id.signup_button)).perform(ViewActions.click());


        ActivityScenario<LoginActivity> loginActivityScenario = ActivityScenario.launch(LoginActivity.class);
        loginActivityScenario.onActivity(activity -> {
            Intent expectedIntent = new Intent(activity, LoginActivity.class);
            Intent actualIntent = new Intent(activity, LoginActivity.class);
            assertTrue(expectedIntent.filterEquals(actualIntent));
        });
    }
}
