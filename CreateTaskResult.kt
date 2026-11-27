package com.example.campustasks.domain

sealed interface CreateTaskResult {

    data class Success(
        val task: Task
    ) : CreateTaskResult

    data class Error(
        val message: String
    ) : CreateTaskResult
}
