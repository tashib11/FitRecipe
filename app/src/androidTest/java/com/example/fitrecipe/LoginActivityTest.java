package com.example.fitrecipe;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasErrorText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityScenarioRule<LoginActivity> activityRule =
            new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    public void testEmptyPasswordError() {
        ActivityScenario<LoginActivity> scenario = activityRule.getScenario();
        scenario.onActivity(activity -> {
            activity.loginUsername.setText("mezba");
            activity.loginButton.performClick();
        });

        Espresso.onView(withId(R.id.login_password))
                .check(matches(hasErrorText("Password cannot be empty")));
    }
    @Test
    public void testEmptyUsernameError() {
        ActivityScenario<LoginActivity> scenario = activityRule.getScenario();
        scenario.onActivity(activity -> {
            activity.loginPassword.setText("password");
            activity.loginButton.performClick();
        });

        Espresso.onView(withId(R.id.login_username))
                .check(matches(hasErrorText("Username cannot be empty")));
    }

    @Test
    public void testIncorrectUsernameError() {
        // Test the case when the username is incorrect and login button is clicked
        Espresso.onView(withId(R.id.login_username)).perform(ViewActions.typeText("incorrectUsername"));
        Espresso.onView(withId(R.id.login_password)).perform(ViewActions.typeText("password"));
        Espresso.onView(withId(R.id.login_button)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.login_username)).check(matches(hasErrorText("Please Give the Correct Username")));
    }

    @Test
    public void testInvalidPasswordError() {
        // Test the case when the password is incorrect and login button is clicked
        Espresso.onView(withId(R.id.login_username)).perform(ViewActions.typeText("johndoe123"));
        Espresso.onView(withId(R.id.login_password)).perform(ViewActions.typeText("incorrectPassword"));
        Espresso.onView(withId(R.id.login_button)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.login_password)).check(matches(hasErrorText("Invalid Password")));
    }

}

