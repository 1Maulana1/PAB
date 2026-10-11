package com.example.hw02.task4

// Part A Function
fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

// Part B Function
fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    // Part A
    val total1 = calculateStudyMinutes(3, 25)
    println("Total study time: $total1 minutes")

    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    println() // Line breakdown between Part A and Part B

    // Part B
    for (courses in 1..5) {
        val credits = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $credits")
    }
}