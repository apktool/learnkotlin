package com.acronymor

fun main() {
    val a: Int = 5
    val b: Int = 10
    println("a == b: ${a == b}")
    println("a < b: ${a < b}")

    val c: Double = 3.14
    println("d(toInt)=${c.toInt()}")
    println("d(toLong)=${c.toLong()}")

    val d: Int = 4
    println("d<<4: ${d shl 1}")
    println("d>>4: ${d shr 1}")

    val e: Boolean = true
    val f: Boolean = false
    println("e && f: ${e && f}")
    println("e || f: ${e || f}")
    println("!f: ${!f}")
}