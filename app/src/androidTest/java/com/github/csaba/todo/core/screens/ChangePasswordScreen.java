package com.github.csaba.todo.core.screens;

import android.view.View;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class ChangePasswordScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withText("Enter NEW password"));
        assertDisplayed(withText("Minimum 8 characters"));
        assertDisplayed(withText("Cancel"));
        assertDisplayed(getOKBtn());
        assertDisplayed(getOldPasswordField());
        assertDisplayed(getNewPasswordField());
        assertDisplayed(getConfirmNewPasswordField());
    }

    public ChangePasswordScreen setOldPassword(String oldPassword) {
        onView(getOldPasswordField()).perform(replaceText(oldPassword));
        return this;
    }

    public ChangePasswordScreen setNewPassword(String newPassword) {
        onView(getNewPasswordField()).perform(replaceText(newPassword));
        return this;
    }

    public ChangePasswordScreen setConfirmNewPassword(String confirmNewPassword) {
        onView(getConfirmNewPasswordField()).perform(replaceText(confirmNewPassword));
        return this;
    }

    public SuccesfullChangePasswordScreen confirmNewPassword() {
        clickOn(getOKBtn());
        return new SuccesfullChangePasswordScreen();
    }

    @NotNull
    private Matcher<View> getOKBtn() {
        return withText("OK");
    }

    @NotNull
    private Matcher<View> getOldPasswordField() {
        return withHint("Old Password");
    }

    @NotNull
    private Matcher<View> getNewPasswordField() {
        return withHint("New Password");
    }

    @NotNull
    private Matcher<View> getConfirmNewPasswordField() {
        return withHint("New Password Again");
    }
}
