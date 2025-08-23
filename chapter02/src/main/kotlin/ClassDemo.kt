package com.acronymor

/**
 * private: 表示这个成员只在这个类(以及它的所有成员)之内可以访问.
 * protected: 表示这个成员的可见度与 private 一样, 但它在子类中也可以访问
 * internal: 表示在 本模块之内, 凡是能够访问到这个类的地方, 同时也能访问到这个类的 internal 成员
 * public: 表示凡是能够访问到这个类的地方, 同时也能访问这个类的 public 成员
 */

// 简单类
final class SimpleClass public constructor(param: String) { // primary constructor
    init {
        println("Init block, params=${param}")
    }

    // secondary constructor
    constructor(p: String, i: Int) : this(param = p) {
        println("Construct p=$p, $i")
    }
}

data class Contact(val name: String, val id: Int)

class Student() {
    var info: String = "Milk"
        get() {
            println("Student::get=$field")
            // field 不能拼错
            return "$field-nb"
        }
        set(value: String) {
            println("Student::set=$value")
            // field 不能拼错
            field = "Cute-$value"
        }
}

// 继承|无主构造器
open class Shape {
    open fun draw() {
        println("Shape::draw()")
    }

    fun fill() {
        println("Shape::fill()")
    }
}

class Circle() : Shape() {
    override fun draw() {
        println("Circle::draw()")
    }
}

// 继承|有主构造器
open class Base(p: Int) {
    val age = p
}

class Derived(p: Int) : Base(p) {
}

// 抽象类
abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        println("Rectangle::draw")
    }
}

// 封闭类
sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()


// 枚举类
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}