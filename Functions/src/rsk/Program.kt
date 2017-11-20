@file:JvmName("DisplayFunctions")
package rsk

fun main(args: Array<String>) {
    display(message = "Hello, World", level = 2)
    println(max(1,2))

    val text = "With      some    extra \t  whitespace"
    println(text.replaceMultipleWhiteSpace())

    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 plus h2
    val h4 = h3 + h3
    println(h4.Name)

    println(fib(7, 1, 0))
}

@JvmOverloads
fun display(message: String, level: Int = 1): Boolean {
    println(message + level)

    return true
}

fun max(a: Int, b: Int): Int = if (a > b) a else b