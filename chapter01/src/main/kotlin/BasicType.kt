package com.acronymor

fun main() {
    val a: Byte = 127
    println("Byte: a=$a")

    val b: Short = 32767
    println("Short: b=$b")

    val c: Int = 9999999
    println("Int: c=$c")

    val d: Long = 999999999
    println("Long: d=$d")

    val e: Float = 9.9F
    println("Float: e=$e")

    val f: Double = 9.99
    println("Double: f=$f")

    val g: Char = 'A'
    println("Char: g=$g")

    val h: Boolean = true
    println("Boolean: h=$h")

    val i: String = "Hello World"
    println("String: i=$i")

    val j: String = """
        1. first line
        2. second line
        3. third line
    """.trimIndent()
    println("Multi String: j=$j")

    val k: String = """
        | 1. first line
        | 2. second line
        | 3. third line
    """.trimMargin()
    println("Multi String: k=$k")

    val l: String = "b=$b"
    println("String Template: $l")

    val m: String = "${'$'}9.99"
    println("String Template: $m")

    val n: String = String.format("%+.4f", 3.1415926)
    println("String Format: $n")
}