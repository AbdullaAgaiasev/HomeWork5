package com.example.registration

class Person (val name: String, val age: Int) {

    fun showInfo() {
        println("Name: $name age: $age")
    }

    fun showInfo(name: String) {
        println("$name")
    }
}