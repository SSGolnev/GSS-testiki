package com.github.csaba.todo.tests.todoList;

import com.github.csaba.todo.core.screens.MainTodoScreen;
import com.github.csaba.todo.tests.BaseEspressoTest;

import org.junit.Test;

import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static com.github.csaba.todo.core.screens.MainTodoListScreen.getTaskFullCardMatcher;

/**
 * Тест проверяет создание обычной задачи
 */
public class ETestCreateTodoTask extends BaseEspressoTest {

    private static final String TASK_NAME = "TaskName123";

    @Test
    public void eTestCreateTodoTask() {
        new MainTodoScreen()
                .clickTodoListBtn()
                .createNewTask()
                .setNewTask(TASK_NAME)
                .confirmNewTask();
        assertDisplayed(getTaskFullCardMatcher(TASK_NAME));
    }
}
