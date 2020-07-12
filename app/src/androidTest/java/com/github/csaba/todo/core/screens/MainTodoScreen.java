package com.github.csaba.todo.core.screens;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.github.csaba.todo.R;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;

/**
 * Основной экран приложения с кнопками выбора списков и смены пароля.
 */
public class MainTodoScreen extends BaseScreen {

    public MainTodoScreen() {
    }

    @Override
    protected void validate() {
        assertDisplayed(allOf(withText("todo"), instanceOf(AppCompatTextView.class)));
        assertDisplayed(getTodoListBtn());
        assertDisplayed(getSecretListBtn());
        assertDisplayed(getChangePasswordBtn());
    }

    public TodoListScreen clickTodoListBtn() {
        clickOn(getTodoListBtn());
        return new TodoListScreen();
    }

    public CreateNewPasswordScreen clickSecretListBtnFirstTime() {
        clickOn(getSecretListBtn());
        return new CreateNewPasswordScreen();
    }

    public EnterPasswordScreen clickSecretListBtn() {
        clickOn(getSecretListBtn());
        return new EnterPasswordScreen();
    }

    public CreateNewPasswordScreen clickChangePasswordBtnFirstTime() {
        clickOn(getChangePasswordBtn());
        return new CreateNewPasswordScreen();
    }

    public ChangePasswordScreen clickChangePasswordBtn() {
        clickOn(getChangePasswordBtn());
        return new ChangePasswordScreen();
    }

    @NotNull
    private Matcher<View> getTodoListBtn() {
        return withId(R.id.todo_button);
    }

    @NotNull
    private Matcher<View> getSecretListBtn() {
        return withId(R.id.secret_button);
    }

    @NotNull
    private Matcher<View> getChangePasswordBtn() {
        return withId(R.id.change_password_button);
    }
}
