package com.example.campustasks.domain

import org.junit.Assert.*
import org.junit.Test

class TaskQueriesTest {

    private val tasks = listOf(
        Task("T001", "Belajar Kotlin", priority = TaskPriority.HIGH, estimatedMinutes = 60),
        Task("T002", "Mengerjakan tugas", priority = TaskPriority.MEDIUM, estimatedMinutes = 90),
        Task("T003", "Membaca buku", priority = TaskPriority.LOW, status = TaskStatus.DONE, estimatedMinutes = 30)
    )

    @Test
    fun getAllReturnsAllTasks() {
        assertEquals(3, TaskQueries.getAll(tasks).size)
    }

    @Test
    fun findByIdReturnsCorrectTask() {
        assertEquals("T001", TaskQueries.findById(tasks, "T001")?.id)
    }

    @Test
    fun findByIdReturnsNullWhenNotFound() {
        assertNull(TaskQueries.findById(tasks, "T999"))
    }

    @Test
    fun findByStatusReturnsCorrectTasks() {
        assertEquals(1, TaskQueries.findByStatus(tasks, TaskStatus.DONE).size)
    }

    @Test
    fun findByPriorityReturnsCorrectTasks() {
        assertEquals(1, TaskQueries.findByPriority(tasks, TaskPriority.HIGH).size)
    }

    @Test
    fun searchByTitleIgnoresCase() {
        assertEquals(1, TaskQueries.searchByTitle(tasks, "KOTLIN").size)
    }
}
