package com.example.kotlinlearning.lessons.Chapter3.part4

val x: Any? = "Hello World"

class Obj {
    var x: Any? = "Hello world"
}

fun main() {
    if (x is String) {
        println(x.length)
    }

    if (x !is String) {
        println("Not a String")
    }

    val a = x as String
    val b = x as? String
    val c = x as? String ?: return
    println(c.length)

    val o = Obj()
//    if (o.x is String){
//        println(o.x.length)
//    }

    (o.x as? String)?.apply {// eger code uygulanabilecek birseyse
        this.length // this String oluyor
        println(length)
    }


}