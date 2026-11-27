package com.example.campustasks.domain

object TaskValidator {

    fun isValidTitle(title: String): Boolean {
        return title.trim().length in 3..80
    }

    fun isValidEstimatedMinutes(minutes: Int): Boolean {
        return minutes in 5..480
    }
}
