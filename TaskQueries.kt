package com.example.campustasks.domain

object TaskQueries {

    fun getAll(tasks: List<Task>): List<Task> {
        return tasks
    }

    fun findById(tasks: List<Task>, id: String): Task? {
        return tasks.find { it.id == id }
    }

    fun findByStatus(tasks: List<Task>, status: TaskStatus): List<Task> {
        return tasks.filter { it.status == status }
    }

    fun findByPriority(tasks: List<Task>, priority: TaskPriority): List<Task> {
        return tasks.filter { it.priority == priority }
    }

    fun searchByTitle(tasks: List<Task>, keyword: String): List<Task> {
        return tasks.filter {
            it.title.contains(keyword, ignoreCase = true)
        }
    }
}
