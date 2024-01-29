package com.example.myapplication

// data class is used to create a class with only data in it
// has no methods, only properties
/*
When a class is defined as a data class, the following methods are implemented.

    equals()
    hashCode(): you'll see this method when working with certain collection types.
    toString()
    componentN(): component1(), component2(), etc.
    copy()

 */
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10;
        var currentAnswered: Int = 5;
    }
}
val Quiz.StudentProgress.progressText : String
    get() = "You've answered $currentAnswered of $total questions"
enum class Difficulty {
    EASY, MEDIUM, HARD
}


fun addTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.currentAnswered) { print("▓") }
    repeat(Quiz.total - Quiz.currentAnswered) { print("▒") }
    println()
    println(Quiz.progressText)
}


fun main() {
    // get input from terminal
    val input : Int = 6

    /*
    Intuitively this seems like switch case
    But it is not, it is more like a if else ladder
    also has a smart use case of in and is operator to check in range or type of the variable
     */

    when (input) {
        1 -> println("1")
        in (2..10) -> println("2..10")
        else -> println("else")
    }

    val x : Int =
        if (input == 1) 1
        else if (input == 2) 2
        else 3
    /*
    This is similar to what rust does, basically the use of ? operator to check if the variable is null or not
    !! operator is used to tell the compiler that the variable is not null
     */
    var myName : String? = "Shreyas"
    println(myName + " " + myName?.length)
    myName = null
    println(myName?.length)
    myName = "Shreyas2"
    println(myName!!.length)

    var fooName : String? = "foo"
    // elvis operator
    val lengthOfFoo = fooName?.length ?: -1
    println(lengthOfFoo)
    val lengthOfFoo2 = if (fooName != null) fooName.length else -1

    println(addTwoNumbers(10, 2))

    val quiz = Quiz()

    quiz.question1.let {
        println(it.questionText)
        println(it.answer)
        println(it.difficulty)
    }

    println(Quiz.progressText)
    Quiz.printProgressBar()
}