package task5

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali", 85, 2023),
        Student("Budi", 62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi", 58, 2022),
        Student("Eka", 76, 2023)
    )

    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }?.let { println("Low scorer : ${it.name} (${it.score})") }

    val total = students.fold(0) { acc, s -> acc + s.score }
    val average = total.toDouble() / students.size
    println("Class average: ${"%.1f".format(average)}")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { s ->
            val status = if (s.score >= 70) "PASS" else "FAIL"
            appendLine("${s.name.padEnd(8)} ${s.score}  $status")
        }
    }
    print(report)
}