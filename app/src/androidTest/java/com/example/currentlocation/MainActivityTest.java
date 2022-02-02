package com.example.currentlocation;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.google.android.gms.tasks.Tasks.await;
import static org.junit.Assert.*;

import android.text.Html;

import androidx.test.rule.ActivityTestRule;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> MainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test_locationServices() throws InterruptedException {

        onView(withId(R.id.btn_location)).perform(click());
        onView(withText("India")).check(matches(isDisplayed()));

    }

}