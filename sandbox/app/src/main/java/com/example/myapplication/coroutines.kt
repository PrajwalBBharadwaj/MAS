package com.example.myapplication

import kotlinx.coroutines.*
import kotlin.system.*


fun main() {
    runBlocking {
        println("${Thread.currentThread().name} has runBlocking")
        launch {
            println("${Thread.currentThread().name} has runBlocking with launch")
            withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name} has runBlocking with launch withContext")
                delay(1000)
                println("10 results found")
            }
            println("${Thread.currentThread().name} end of launch function")
        }
        println("Loading...")
    }
}