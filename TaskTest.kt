
package com.example.campustasks.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class TaskTest {

    private val task = Task(
        id = "T001",
        title = "Mengerjakan tugas",
        priority = TaskPriority.HIGH,
        estimatedMinutes = 60
    )

    @Test
    fun markInProgressChangesStatus() {
        val result = task.markInProgress()

        assertEquals(TaskStatus.IN_PROGRESS, result.status)
    }

    @Test
    fun markDoneChangesStatus() {
        val result = task.markDone()

        assertEquals(TaskStatus.DONE, result.status)
    }

    @Test
    fun originalTaskRemainsUnchanged() {
        task.markDone()

        assertEquals(TaskStatus.TODO, task.status)
    }
}
