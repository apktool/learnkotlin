package com.acronymor

fun main() {
    // if/else
    val a: Int = 5
    val b: Int = 6
    if (a < b) {
        println("a+b=${a + b}")
    } else {
        println("a-b=${a - b}")
    }

    val c = if (a < b) a + b else a - b
    println("c=$c")

    // when 带主语，无返回值
    val d = 2
    when (d) {
        1, 2 -> println("d==1 or d == 2")
        else -> println("d is neither 1 nor 2")
    }

    // when 带主语，在某个范围
    when (d) {
        in 1..10 -> println("d is in the range")
        !in 10..20 -> println("d is outside the range")
        else -> println("none of tha above")
    }

    // when 不带主语，有返回值
    val message = when {
        a < b -> "a is less than b"
        a > b -> "a is greater than b"
        else -> "a is equal to b"
    }
    println("message=${message}")

    val e = arrayOf(1, 2, 3, 8, 9, 0)
    for (item in e) {
        print("$item ")
    }
    println()

    for ((idx, item) in e.withIndex()) {
        println("idx=$idx, item=$item")
    }

    for (i in 100..110 step 2) {
        print("$i, ")
    }
    println()

    for (i in 100 until 110) {
        print("$i, ")
    }
    println()

    for (i in 110 downTo 100) {
        print("$i, ")
    }
    println()

    // while
    var f = 5
    while (f > 0) {
        print("$f ")
        f--
    }
    println()

    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        print(it)
    }
    print(" done with explicit label")
}