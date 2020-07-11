package com.github.csaba.todo.core.screens;

public abstract class BaseScreen {

    BaseScreen() {
        validate();
    }

    abstract protected void validate();
}
