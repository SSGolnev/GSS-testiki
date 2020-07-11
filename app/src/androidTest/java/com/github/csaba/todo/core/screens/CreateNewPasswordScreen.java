package com.github.csaba.todo.core.screens;

import android.view.View;
import android.widget.EditText;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class CreateNewPasswordScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withText("Enter NEW password"));
        assertDisplayed(withText("Minimum 8 characters"));
        assertDisplayed(getPasswordField());
        assertDisplayed(withText("Cancel"));
        assertDisplayed(getOKBtn());
    }

    public CreateNewPasswordScreen setNewPassword(String newPassword) {
        onView(getPasswordField()).perform(replaceText(newPassword));
        return this;
    }

    public MainTodoScreen confirmNewPassword() {
        clickOn(getOKBtn());
        return new MainTodoScreen();
    }

    @NotNull
    private Matcher<View> getPasswordField() {
        return Matchers.<View>instanceOf(EditText.class);
    }

    @NotNull
    private Matcher<View> getOKBtn() {
        return withText("OK");
    }
}
