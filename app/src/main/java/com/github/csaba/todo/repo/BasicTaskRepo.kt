package com.github.csaba.todo.repo

interface BasicTaskRepo {
    fun addTask(task: String)

    fun deleteTask(task: String)

    fun findAll(): List<String>
}