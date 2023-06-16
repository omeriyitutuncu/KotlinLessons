package com.example.kotlinlearning.lessons.Chapter3

import java.util.UUID

data class Customer(val id: UUID, val name: String,val double:Double)

object CustomerService1 {
//    fun create(name: String, id: UUID? = null): Customer {
//        return Customer(id ?: UUID.randomUUID(), name)
//    }

//    fun create2(name: String, id: UUID = UUID.randomUUID()): Customer {
//        return Customer(id, name)
//    }
    fun create3(name: String, id: UUID = UUID.randomUUID(),discount:Double=0.0): Customer {
        return Customer(id, name,discount)
    }
}

fun main() {
    val c1 = CustomerService1.create3("omer")
    val c2 = CustomerService1.create3("ali")
    val c3 = CustomerService1.create3(name = "ali", discount = 50.6)
    println("$c1 \n\n\n $c2\n" +
            "\n" +
            "\n" +
            " $c3")
}
