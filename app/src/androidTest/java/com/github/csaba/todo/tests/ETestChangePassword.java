package com.github.csaba.todo.tests;

import com.github.csaba.todo.core.screens.MainTodoScreen;

import org.junit.Test;

public class ETestChangePassword extends BaseEspressoTest {

    private static final String PASSWORD = "Password12345";
    private static final String NEW_PASSWORD = "Password54321";

    @Test
    public void eTestChangePassword() {
        new MainTodoScreen()
                .clickChangePasswordBtnFirstTime()
                .setNewPassword(PASSWORD)
                .confirmNewPassword()
                .clickChangePasswordBtn()
                .setOldPassword(PASSWORD)
                .setNewPassword(NEW_PASSWORD)
                .setConfirmNewPassword(NEW_PASSWORD)
                .confirmNewPassword()
                .confirmChangePassword()
                .clickSecretListBtn()
                .setPassword(PASSWORD)
                .confirmInvalidatePassword()
                .confirmError()
                .clickSecretListBtn()
                .setPassword(NEW_PASSWORD)
                .confirmPassword();
    }
}
