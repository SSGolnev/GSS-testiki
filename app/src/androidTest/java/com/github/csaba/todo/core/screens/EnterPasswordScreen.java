package com.github.csaba.todo.core.screens;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.EditText;

import com.github.csaba.todo.R;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.ActionsHelper.replaceTextIn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static org.hamcrest.Matchers.allOf;

public class EnterPasswordScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(allOf(withId(R.id.alertTitle), withText("Enter password")));
        assertDisplayed(allOf(Matchers.<View>instanceOf(AppCompatTextView.class), withText("Enter password")));
        assertDisplayed(getPasswordField());
        assertDisplayed(withText("Cancel"));
        assertDisplayed(getOKBtn());
    }

    public EnterPasswordScreen setPassword(String password) {
        replaceTextIn(getPasswordField(), password);
        return this;
    }

    public SecretTodoListScreen confirmPassword() {
        clickOn(withText("OK"));
        return new SecretTodoListScreen();
    }

    public InvalidatePasswordScreen confirmInvalidatePassword() {
        clickOn(withText("OK"));
        return new InvalidatePasswordScreen();
    }

    @NotNull
    private Matcher<View> getOKBtn() {
        return withText("OK");
    }

    @NotNull
    private Matcher<View> getPasswordField() {
        return Matchers.<View>instanceOf(EditText.class);
    }
}
