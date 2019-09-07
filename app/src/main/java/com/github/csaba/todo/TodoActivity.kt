package com.github.csaba.todo

import android.os.Bundle
import com.github.csaba.todo.db.TodoDbHelper
import com.github.csaba.todo.repo.TaskRepo

class TodoActivity : BaseTodoActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        val todoDbHelper = TodoDbHelper(this)
        setRepo(TaskRepo(todoDbHelper))

        mTaskListView = findViewById(R.id.list_todo)

        updateUI()
    }
}
