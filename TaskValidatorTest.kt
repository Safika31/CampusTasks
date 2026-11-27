
package com.example.campustasks.domain

import org.junit.Assert.*
import org.junit.Test

class TaskValidatorTest {

    @Test
    fun validTitleReturnsTrue() {
        assertTrue(TaskValidator.isValidTitle("Tugas Kotlin"))
    }

    @Test
    fun titleWithExactlyThreeCharactersIsValid() {
        assertTrue(TaskValidator.isValidTitle("ABC"))
    }

    @Test
    fun titleWithExactlyEightyCharactersIsValid() {
        assertTrue(TaskValidator.isValidTitle("A".repeat(80)))
    }

    @Test
    fun blankTitleReturnsFalse() {
        assertFalse(TaskValidator.isValidTitle("   "))
    }

    @Test
    fun titleWithTwoCharactersReturnsFalse() {
        assertFalse(TaskValidator.isValidTitle("AB"))
    }

    @Test
    fun titleWithEightyOneCharactersReturnsFalse() {
        assertFalse(TaskValidator.isValidTitle("A".repeat(81)))
    }

    @Test
    fun validEstimatedMinutesReturnsTrue() {
        assertTrue(TaskValidator.isValidEstimatedMinutes(60))
    }

    @Test
    fun minimumEstimatedMinutesIsValid() {
        assertTrue(TaskValidator.isValidEstimatedMinutes(5))
    }

    @Test
    fun maximumEstimatedMinutesIsValid() {
        assertTrue(TaskValidator.isValidEstimatedMinutes(480))
    }

    @Test
    fun estimatedMinutesBelowMinimumReturnsFalse() {
        assertFalse(TaskValidator.isValidEstimatedMinutes(4))
    }

    @Test
    fun estimatedMinutesAboveMaximumReturnsFalse() {
        assertFalse(TaskValidator.isValidEstimatedMinutes(481))
    }
}
