package task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int = operation(operation(n))

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> = list.map(mapper)

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(applyTwice(3, double))                 // 12

    val startsWithVowel: (String) -> Boolean = { s ->
        s.isNotEmpty() && s.first().lowercaseChar() in "aeiou"
    }
    val courses = listOf("Algorithms", "Basis Data", "Interaksi Manusia Komputer",
        "Mobile Development", "Operating Systems")
    printIf(courses, startsWithVowel)

    println(transform(listOf(2, 3, 4)) { (it * it).toString() })   // [4, 9, 16]
}