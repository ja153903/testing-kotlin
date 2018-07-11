import java.util.*;

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun product(a: Int, b: Int) = a * b

fun parseInt(str: String): Int? {
    if (str.isEmpty()) {
        return null
    }
    return Integer.parseInt(str)
}

fun main(args: Array<String>) {
    println(sum(4, 5))
    println(product(4, 5))
    println(parseInt(""))
    println(parseInt("234"))

    val items = listOf<String>("banana", "computer", "camera")
    items
            .filter { it.startsWith("c") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{ println(it) }
}