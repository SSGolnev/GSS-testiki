package com.github.csaba.todo.core.screens;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Диалог успешной смены пароля
 */
public class SuccesfullChangePasswordScreen extends MainDialogScreen {

    @Override
    protected void validate() {
        super.validate();
        assertDisplayed(withText("Info"));
        assertDisplayed(withText("Password changed successfully"));
    }

    public MainTodoScreen confirmChangePassword() {
        clickOn(getOKBtn());
        return new MainTodoScreen();
    }
}
