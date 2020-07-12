package com.github.csaba.todo.core.screens;

import android.view.View;
import android.widget.EditText;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.ActionsHelper.replaceTextIn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Диалог создания нового пароля
 */
public class CreateNewPasswordScreen extends MainDialogScreen {

    @Override
    protected void validate() {
        super.validate();
        assertDisplayed(withText("Enter NEW password"));
        assertDisplayed(withText("Minimum 8 characters"));
        assertDisplayed(getPasswordField());
        assertDisplayed(withText("Cancel"));
    }

    public CreateNewPasswordScreen setNewPassword(String newPassword) {
        replaceTextIn(getPasswordField(), newPassword);
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
}
