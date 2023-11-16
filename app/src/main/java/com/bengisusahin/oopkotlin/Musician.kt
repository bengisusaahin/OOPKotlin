package com.bengisusahin.oopkotlin

open class Musician(name: String, instrument: String, age: Int) {

    //ulasilmasin istedigim icin komple sildim
//    var name : String? = name
//    var instrument : String? = instrument
//    var age : Int? = age

    //degistirilmesin ama okunsun ENCAPSULATION
    var name : String? = name
        private set
        get

    private var instrument : String? = instrument
    var age : Int? = age
        get
        private set

    private val bandName : String = "Metallica"

    fun returnBandName(password: String) : String {
        if (password == "Atil"){
            return bandName
        }else
            return "Wrong password!"
    }
}