package com.github.csaba.todo.tests;

import com.github.csaba.todo.core.screens.MainTodoScreen;

import org.junit.Test;

public class ETestCloseTask extends BaseEspressoTest {

    private static final String TASK_NAME = "TaskName123";

    @Test
    public void eTestCloseTask() {
        new MainTodoScreen()
                .clickTodoListBtn()
                .createNewTask()
                .setNewTask(TASK_NAME)
                .confirmNewTask()
                .deleteTask(TASK_NAME);
    }
}
