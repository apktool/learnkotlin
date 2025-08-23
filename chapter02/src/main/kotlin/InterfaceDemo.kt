package com.acronymor

// 简单接口
interface MyInterface {
    val prop: Int

    fun to() {
        println("MyInterface::to")
    }

    fun go()
}

class MyInterfaceChild : MyInterface {
    override val prop: Int
        get() = 100


    override fun go() {
        println("MyInterfaceChild::go")
        to()
    }
}

// 简单接口|解决覆盖冲突
interface InterfaceA {
    fun foo() {
        println("InterfaceA::foo")
    }

    fun bar() {
        println("InterfaceA::bar")
    }
}

interface InterfaceB {
    fun foo() {
        println("InterfaceB::foo")
    }

    fun bar() {
        println("InterfaceB::bar")
    }
}

class InterfaceImpl : InterfaceA, InterfaceB {
    override fun foo() {
        super<InterfaceA>.foo()
        super<InterfaceB>.foo()
    }

    override fun bar() {
        super<InterfaceA>.bar()
        super<InterfaceB>.bar()
    }
}

// SAM 函数式接口
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}