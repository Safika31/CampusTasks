package com.example.campustasks.domain

object TaskFactory {

    fun create(
        id: String,
        title: String,
        description: String? = null,
        priority: TaskPriority,
        estimatedMinutes: Int,
        tags: Set<String> = emptySet()
    ): CreateTaskResult {

        if (!TaskValidator.isValidTitle(title)) {
            return CreateTaskResult.Error(
                "Title must contain 3 to 80 characters"
            )
        }

        if (!TaskValidator.isValidEstimatedMinutes(estimatedMinutes)) {
            return CreateTaskResult.Error(
                "Estimated minutes must be between 5 and 480"
            )
        }

        val normalizedTitle = title.trim()
        val normalizedDescription =
            description?.trim()?.takeIf { it.isNotEmpty() }

        val normalizedTags = tags
            .map { it.trim().lowercase() }
            .filter { it.isNotEmpty() }
            .toSet()

        val task = Task(
            id = id,
            title = normalizedTitle,
            description = normalizedDescription,
            priority = priority,
            estimatedMinutes = estimatedMinutes,
            tags = normalizedTags
        )

        return CreateTaskResult.Success(task)
    }
}
