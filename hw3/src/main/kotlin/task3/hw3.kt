package com.example.hw03.task3

fun printStudentInfo(studentName: String?) {
    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let {
        println("Hello, $it!")
    }
}

fun main() {
    // Uji coba dengan null
    var studentName: String? = null
    printStudentInfo(studentName)

    println() // Pemisah antar uji coba

    // Uji coba dengan nilai "Ayu"
    studentName = "Ayu"
    printStudentInfo(studentName)
}