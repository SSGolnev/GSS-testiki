package com.github.csaba.todo.tests;


import com.github.csaba.todo.core.screens.MainTodoScreen;

import org.junit.Test;

public class ETestSetPassword extends BaseEspressoTest {

    private static final String NEW_PASSWORD = "Password12345";

    @Test
    public void eTestSetPassword() {
        new MainTodoScreen()
                .clickChangePasswordBtnFirstTime()
                .setNewPassword(NEW_PASSWORD)
                .confirmNewPassword()
                .clickSecretListBtn()
                .setPassword(NEW_PASSWORD)
                .confirmPassword();
    }
}
