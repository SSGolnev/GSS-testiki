package com.github.csaba.todo

import android.os.Bundle
import com.github.csaba.todo.db.TodoDbHelper
import com.github.csaba.todo.repo.SecureTaskRepo

class SecureTodoActivity : BaseTodoActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        val todoDbHelper = TodoDbHelper(this)
        setRepo(SecureTaskRepo(todoDbHelper, intent.getStringExtra("password")))

        mTaskListView = findViewById(R.id.list_todo)

        updateUI()
    }
}
