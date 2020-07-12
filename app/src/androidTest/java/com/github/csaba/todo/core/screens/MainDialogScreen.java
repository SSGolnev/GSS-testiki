package com.github.csaba.todo.core.screens;

import android.view.View;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class MainDialogScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(getOKBtn());
    }

    @NotNull
    Matcher<View> getOKBtn() {
        return withText("OK");
    }
}
