package com.github.csaba.todo.core.screens;

import android.view.View;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Диалог ошибки ввода пароля
 */
public class InvalidatePasswordScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withText("Error"));
        assertDisplayed(withText("invalid password"));
        assertDisplayed(getOKBtn());
    }

    public MainTodoScreen confirmError() {
        clickOn(getOKBtn());
        return new MainTodoScreen();
    }

    @NotNull
    private Matcher<View> getOKBtn() {
        return withText("OK");
    }
}
