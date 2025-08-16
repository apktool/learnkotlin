package com.acronymor

fun main() {
    val a: Array<String> = arrayOf("Nile", "Amazon", "Yangtz")
    println(a.joinToString(", "))

    val b: Array<Int> = Array<Int>(3) { 9 }
    println(b.joinToString())

    val c = arrayOf(1, 2, 3)
    val d = arrayOf(1, 2, 3)
    println(c.contentEquals(d))
    println(c contentEquals d)

    val e = arrayOf(1, 2, 3)
    e.shuffle()
    println(e.joinToString())

    val f: List<String> = listOf("a", "b", "c")
    println(f.joinToString())

    val g: Set<String> = setOf("1", "1", "2", "3")
    println(g.joinToString())

    val h: Map<String, Int> = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)
    println("map[one]=${h["one"]}")
    println("map[two]=${h.get("two")}")
    println("map[three]=${h.getOrDefault("four", 4)}")

    var i: MutableMap<String, Int> = mutableMapOf<String, Int>()
    i["one"] = 1
    i["two"] = 2
    println(i.entries.joinToString())
}