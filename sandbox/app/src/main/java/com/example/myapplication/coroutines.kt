package com.example.myapplication

import kotlinx.coroutines.*
import kotlin.system.*

suspend fun fakeWork() : String {
    val time = measureTimeMillis {
        println("Fake work starts: ${Thread.currentThread().name}" + " is inside the function")
        delay(1000)
        println("Fake work finished: ${Thread.currentThread().name}" + " is inside the function")
    }
    return "Time: ${time / 1000.0}"
}

suspend fun anotherFakeWork() : String {
    // this returns time in seconds
    val time = measureTimeMillis {
        println("Another fake work starts: ${Thread.currentThread().name}" + "is inside the function")
        delay(1500)
        println("Another fake work finished: ${Thread.currentThread().name}" + "Is inside the function")
    }
    return "Time: Another Fake Work $time"
}

suspend fun addTimes() : String {
    var returnVal : String = ""
    coroutineScope {
        val time1 : Deferred<String> = async { fakeWork() }
        val time2 : Deferred<String> = async { anotherFakeWork() }
        time2.cancel()
        returnVal = time1.await()
    }
    assert(returnVal != "")
    return returnVal
}

fun main() {
    val totalTime = measureTimeMillis {
        runBlocking {
            println("Main program starts: ${Thread.currentThread().name}")
            val time = addTimes()
            println(time)
            println("Main program continues: ${Thread.currentThread().name}")
        }
    }
    println("Total time: $totalTime")
}