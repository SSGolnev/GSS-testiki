package com.github.csaba.todo.core.screens;

/**
 * Базовый скрин. Все скрины должны быть наследованы от базы.
 */
public abstract class BaseScreen {

    BaseScreen() {
        validate();
    }

    abstract protected void validate();
}
