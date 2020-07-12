package com.github.csaba.todo.tests.secureList;

import com.github.csaba.todo.core.screens.MainTodoScreen;
import com.github.csaba.todo.tests.BaseEspressoTest;

import org.junit.Test;

import static com.github.csaba.todo.core.helpers.AssertsHelper.assertDisplayed;
import static com.github.csaba.todo.core.screens.MainTodoListScreen.getTaskFullCardMatcher;

/**
 * Тест проверяет создание секретной задачи
 */
public class ETestCreateSecretTask extends BaseEspressoTest {

    private static final String PASSWORD = "Password12345";
    private static final String TASK_NAME = "TaskName123";

    @Test
    public void eTestCreateSecretTask() {
        new MainTodoScreen()
                .clickSecretListBtnFirstTime()
                .setNewPassword(PASSWORD)
                .confirmNewPassword()
                .clickSecretListBtn()
                .setPassword(PASSWORD)
                .confirmPassword()
                .createNewTask()
                .setNewTask(TASK_NAME)
                .confirmNewTask();
        assertDisplayed(getTaskFullCardMatcher(TASK_NAME));
    }
}
