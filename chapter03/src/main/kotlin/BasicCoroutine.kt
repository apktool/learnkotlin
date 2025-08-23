package com.acronymor

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

suspend fun doWord() = coroutineScope {
    launch {
        delay(2000L)
        println("World!")
    }

    launch {
        delay(1000L)
        println("Hello")
    }

    val job = launch {
        println("Done, the job")
    }
    job.join()

    println("---------------")

}

fun main() {
    runBlocking { doWord() }
}