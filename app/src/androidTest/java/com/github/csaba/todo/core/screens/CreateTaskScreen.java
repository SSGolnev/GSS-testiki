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

public class CreateTaskScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withText("Add a new task"));
        assertDisplayed(withText("What is your next task?"));
        assertDisplayed(getTaskField());
        assertDisplayed(withText("Cancel"));
        assertDisplayed(getAddBtn());
    }

    public CreateTaskScreen setNewTask(String newTaskText) {
        replaceTextIn(getTaskField(), newTaskText);
        return this;
    }

    public TodoListScreen confirmNewTask() {
        clickOn(getAddBtn());
        return new TodoListScreen();
    }

    @NotNull
    private Matcher<View> getTaskField() {
        return Matchers.<View>instanceOf(EditText.class);
    }

    @NotNull
    private Matcher<View> getAddBtn() {
        return withText("Add");
    }
}
