package com.example.myapplication

import kotlinx.coroutines.*
import kotlin.system.*

suspend fun fakeWork() {
    val time = measureTimeMillis {
        println("Fake work starts: ${Thread.currentThread().name}" + "is inside the function")
        delay(1000)
        println("Fake work finished: ${Thread.currentThread().name}" + "Is inside the function")
    }
    println("Time taken: $time")
}

fun main() {
    val totalTime = measureTimeMillis {
        runBlocking {
            println("Main program starts: ${Thread.currentThread().name}")
            val job = launch {
                println("Fake work starts: ${Thread.currentThread().name}" + "is inside the coroutine")
                delay(1000)
                println("Fake work finished: ${Thread.currentThread().name}" + " is inside the coroutine")
            }
            fakeWork()
            println("Main program continues: ${Thread.currentThread().name}")
        }
    }
    println("Total time: $totalTime")
}