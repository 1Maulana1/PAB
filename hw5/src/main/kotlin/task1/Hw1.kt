package task1

fun main() {
    // 1. Lambda double
    val double: (Int) -> Int = { n -> n * 2 }
    println(double(7))

    // 2. Lambda cek huruf awal vokal
    val startsWithVowel: (String) -> Boolean = { s ->
        s.isNotEmpty() && s.first().lowercaseChar() in "aeiou"
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Lambda ambil yang terbesar
    val larger: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(larger(12, 7))
}