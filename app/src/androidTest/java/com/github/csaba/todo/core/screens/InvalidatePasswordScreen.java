package com.github.csaba.todo.core.screens;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

/**
 * Диалог ошибки ввода пароля
 */
public class InvalidatePasswordScreen extends MainDialogScreen {

    @Override
    protected void validate() {
        super.validate();
        assertDisplayed(withText("Error"));
        assertDisplayed(withText("invalid password"));
    }

    public MainTodoScreen confirmError() {
        clickOn(getOKBtn());
        return new MainTodoScreen();
    }
}
