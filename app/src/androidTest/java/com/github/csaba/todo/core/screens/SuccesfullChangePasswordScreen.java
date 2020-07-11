package com.github.csaba.todo.core.screens;

import android.view.View;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class SuccesfullChangePasswordScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withText("Info"));
        assertDisplayed(withText("Password changed successfully"));
        assertDisplayed(getOKBtn());
    }

    public MainTodoScreen confirmChangePassword() {
        clickOn(getOKBtn());
        return new MainTodoScreen();
    }

    @NotNull
    private Matcher<View> getOKBtn() {
        return withText("OK");
    }
}
