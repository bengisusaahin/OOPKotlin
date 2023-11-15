package com.bengisusahin.oopkotlin

class User {

    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init cogu dilde ayni ama kotlinde bir fark var
    constructor(nameInput : String, ageInput : Int){
        this.name = nameInput
        this.age = ageInput
        println("user created")
    }

    init {
        println("Init")
    }
}