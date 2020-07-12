package com.github.csaba.todo.core.screens;

import android.view.View;

import com.github.csaba.todo.R;

import org.hamcrest.Matcher;
import org.jetbrains.annotations.NotNull;

import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.github.csaba.todo.core.helpers.ActionsHelper.clickOn;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertNotExist;
import static org.hamcrest.Matchers.allOf;

/**
 * Базовый экран списка задач
 */
public class MainTodoListScreen extends BaseScreen {

    MainTodoListScreen() {
    }

    @Override
    protected void validate() {
        assertDisplayed(getAddTaskBtn());
    }

    public CreateTaskScreen createNewTask() {
        clickOn(getAddTaskBtn());
        return new CreateTaskScreen();
    }

    public MainTodoListScreen deleteTask(String taskName) {
        assertDisplayed(getTaskFullCardMatcher(taskName));
        clickOn(getDoneBtnForTaskWithNameMatcher(taskName));
        assertNotExist(getTaskFullCardMatcher(taskName));
        return this;
    }

    @NotNull
    private Matcher<View> getAddTaskBtn() {
        return withId(R.id.action_add_task);
    }

    public static Matcher<View> getTaskFullCardMatcher(String taskText) {
        return allOf(
                allOf(withId(R.id.task_title), withText(taskText)),
                hasSibling(withId(R.id.task_delete))
        );
    }

    public static Matcher<View> getDoneBtnForTaskWithNameMatcher(String taskText) {
        return allOf(
                withId(R.id.task_delete),
                hasSibling(allOf(withId(R.id.task_title), withText(taskText)))
        );
    }
}
