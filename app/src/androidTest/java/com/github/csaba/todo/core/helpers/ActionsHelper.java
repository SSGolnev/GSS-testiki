package com.github.csaba.todo.core.helpers;

import android.view.View;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Класс экшнов для работы с матчерами
 */
public class ActionsHelper {

    private ActionsHelper() {

    }

    public static void clickOn(Matcher<View> viewMatcher) {
        assertDisplayed(viewMatcher);
        onView(viewMatcher).perform(click());
    }

    public static void replaceTextIn(Matcher<View> viewMatcher, String text) {
        assertDisplayed(viewMatcher);
        onView(viewMatcher).perform(replaceText(text));
    }
}
