package com.example.kotlinlearning.lessons.Chapter3.part3

import java.time.LocalDateTime


data class Customer(val name2: String)

interface CustomerEventListener {
    fun customerSaved(customer: Customer)
    fun customerDelete(customer: Customer)
}

class CustomerService {
    companion object {
        private val listeners = mutableListOf<CustomerEventListener>()

        @JvmStatic // javadan ulasmamaizi sagliyor
        fun addListener(listener: CustomerEventListener) {
            listeners.add(listener)
        }
    }

    fun save(customer: Customer) {
        val data = gatherData(customer)
        data.created
        data.x=43
        listeners.forEach { listener -> listener.customerSaved(customer) }
    }

    fun delete(customer: Customer) {
        listeners.forEach { listener -> listener.customerDelete(customer) }

    }

    private fun gatherData(customer: Customer)=object {
        val created = LocalDateTime.now()
        var x = 42
    }

}

fun main() {

    val service = CustomerService()
    CustomerService.addListener(object : CustomerEventListener {
        override fun customerSaved(customer: Customer) {
            println("$customer saved from $service")
        }

        override fun customerDelete(customer: Customer) {
            println("$customer deleted")
        }

    })
    service.save(Customer("dd"))
}