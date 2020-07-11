package com.github.csaba.todo.core.helpers;

import android.view.View;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class ActionsHelper {

    private ActionsHelper() {

    }

    public static void clickOn(Matcher<View> viewMatcher) {
        assertDisplayed(viewMatcher);
        onView(viewMatcher).perform(click());
    }
}
