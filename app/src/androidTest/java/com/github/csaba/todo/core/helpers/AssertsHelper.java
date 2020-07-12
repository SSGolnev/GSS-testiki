package com.github.csaba.todo.core.helpers;

import android.view.View;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

/**
 * Класс ассертов для работы с матчерами
 */
public class AssertsHelper {
    private AssertsHelper() {
    }

    public static void assertDisplayed(Matcher<View> viewMatcher) {
        onView(viewMatcher).check(matches(isDisplayed()));
    }

    public static void assertNotExist(Matcher<View> viewMatcher) {
        onView(viewMatcher).check(doesNotExist());
    }
}
