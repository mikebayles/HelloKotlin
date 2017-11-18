import java.io.FileReader
import java.util.*
import javax.print.attribute.IntegerSyntax

fun main(args: Array<String>) {
    println("Hello, World")

    val q = Question()

    q.Answer = "42"

    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")

    val message = if (q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again?"
    }

    println(message)
    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.Answer)
    } catch(e:NumberFormatException) {
        null
    }

    println("Number is $number")

    for(i in 10 downTo 1 step 2) {
        println(i)
    }

    println()

    for(i in 1..10) {
        println(i)
    }

    println()

    for(i in 1 until 10) {
        println(i)
    }

    println()

    var numbers = listOf(1,2,4,5,6)
    for(i in numbers) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Mike"] = 24
    ages["Emily"] = 25

    for((name, age) in ages) {
        println("$name is $age years old")
    }

    for((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    val chars = 'A'..'z'
    for(c in chars) {
        print(c)
    }

    val reader = FileReader("filename")
    for(line in reader.readLines()) {

    }
}

class Question {
    var Answer: String = ""
    var CorrectAnswer = "42"
    val Question: String = "What is the answer to life?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> print("You were correct")
            else -> print("Try again?")
        }
    }
}