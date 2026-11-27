
package com.example.campustasks.domain

import org.junit.Assert.*
import org.junit.Test

class TaskFactoryTest {

    @Test
    fun createValidTaskReturnsSuccess() {
        val result = TaskFactory.create(
            id = "T001",
            title = "Belajar Kotlin",
            description = "Mempelajari dasar Kotlin",
            priority = TaskPriority.HIGH,
            estimatedMinutes = 60,
            tags = setOf("Kotlin", "Mobile")
        )

        assertTrue(result is CreateTaskResult.Success)
    }

    @Test
    fun createTaskWithInvalidTitleReturnsError() {
        val result = TaskFactory.create(
            id = "T002",
            title = "AB",
            priority = TaskPriority.MEDIUM,
            estimatedMinutes = 60
        )

        assertTrue(result is CreateTaskResult.Error)
    }

    @Test
    fun createTaskWithInvalidMinutesReturnsError() {
        val result = TaskFactory.create(
            id = "T003",
            title = "Belajar Kotlin",
            priority = TaskPriority.MEDIUM,
            estimatedMinutes = 3
        )

        assertTrue(result is CreateTaskResult.Error)
    }

    @Test
    fun createTaskTrimsTitle() {
        val result = TaskFactory.create(
            id = "T004",
            title = "  Belajar Kotlin  ",
            priority = TaskPriority.HIGH,
            estimatedMinutes = 60
        )

        assertTrue(result is CreateTaskResult.Success)

        if (result is CreateTaskResult.Success) {
            assertEquals("Belajar Kotlin", result.task.title)
        }
    }

    @Test
    fun createTaskNormalizesTags() {
        val result = TaskFactory.create(
            id = "T005",
            title = "Belajar Kotlin",
            priority = TaskPriority.MEDIUM,
            estimatedMinutes = 60,
            tags = setOf(" Kotlin ", "MOBILE", "kotlin")
        )

        assertTrue(result is CreateTaskResult.Success)

        if (result is CreateTaskResult.Success) {
            assertEquals(setOf("kotlin", "mobile"), result.task.tags)
        }
    }
}
