package com.example.hw02.task2

fun main() {
    // Part A
    val daysList = listOf(-1, 0, 2)
    for (daysRemaining in daysList) {
        if (daysRemaining < 0) {
            println("Overdue")
        } else if (daysRemaining == 0) {
            println("Due today")
        } else {
            println("Upcoming")
        }
    }

    println() // Line breakdown between Part A and Part B

    // Part B
    val monthList = listOf(9, 13)
    for (month in monthList) {
        val monthName = when (month) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Invalid month"
        }
        println("Month $month: $monthName")
    }
}