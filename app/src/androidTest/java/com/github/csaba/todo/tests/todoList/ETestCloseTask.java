package com.github.csaba.todo.tests.todoList;

import com.github.csaba.todo.core.screens.MainTodoScreen;
import com.github.csaba.todo.tests.BaseEspressoTest;

import org.junit.Test;

import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static com.github.csaba.todo.core.screens.MainTodoListScreen.getTaskFullCardMatcher;

/**
 * Тест проверяет закрытие обычной задачи
 */
public class ETestCloseTask extends BaseEspressoTest {

    private static final String TASK_NAME_1 = "TaskName123";
    private static final String TASK_NAME_2 = "TaskName321";

    @Test
    public void eTestCloseTask() {
        new MainTodoScreen()
                .clickTodoListBtn()
                .createNewTask()
                .setNewTask(TASK_NAME_1)
                .confirmNewTask()
                .createNewTask()
                .setNewTask(TASK_NAME_2)
                .confirmNewTask()
                .deleteTask(TASK_NAME_1);
        assertDisplayed(getTaskFullCardMatcher(TASK_NAME_2));
    }
}
