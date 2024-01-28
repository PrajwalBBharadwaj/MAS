package com.example.myapplication

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
}