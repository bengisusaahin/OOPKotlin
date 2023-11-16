package com.bengisusahin.oopkotlin

class Dog : Animal() {
    fun test(){
        super.sing() // super inheritance aldıgınız sınıfa referans verir
    }

    override fun sing(){
        println("dog class")
    }
}