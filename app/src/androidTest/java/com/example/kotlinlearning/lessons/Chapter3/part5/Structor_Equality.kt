package com.example.kotlinlearning.lessons.Chapter3.part5

data class Point(val x: Int, val y: Int)

fun main() {
    val a = Point(1, 2)
    val b = Point(1, 2)
    assert(a == b) // configuration a -ea has added
    assert(a !== b)
    val c: Point? = null
    assert(c == null)

}