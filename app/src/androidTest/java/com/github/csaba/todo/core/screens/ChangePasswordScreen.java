package com.github.csaba.todo.core.screens;

import android.view.View;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.ActionsHelper.replaceTextIn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Диалог смены пароля.
 */
public class ChangePasswordScreen extends MainDialogScreen {

    @Override
    protected void validate() {
        super.validate();
        assertDisplayed(withText("Enter NEW password"));
        assertDisplayed(withText("Minimum 8 characters"));
        assertDisplayed(withText("Cancel"));
        assertDisplayed(getOldPasswordField());
        assertDisplayed(getNewPasswordField());
        assertDisplayed(getConfirmNewPasswordField());
    }

    public ChangePasswordScreen setOldPassword(String oldPassword) {
        replaceTextIn(getOldPasswordField(), oldPassword);
        return this;
    }

    public ChangePasswordScreen setNewPassword(String newPassword) {
        replaceTextIn(getNewPasswordField(), newPassword);
        return this;
    }

    public ChangePasswordScreen setConfirmNewPassword(String confirmNewPassword) {
        replaceTextIn(getConfirmNewPasswordField(), confirmNewPassword);
        return this;
    }

    public SuccesfullChangePasswordScreen confirmNewPassword() {
        clickOn(getOKBtn());
        return new SuccesfullChangePasswordScreen();
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
