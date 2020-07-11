package com.github.csaba.todo.core.screens;

import com.github.csaba.todo.R;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;

public class MainTodoListScreen extends BaseScreen {

    @Override
    protected void validate() {
        assertDisplayed(withId(R.id.action_add_task));
    }
}
