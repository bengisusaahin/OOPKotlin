package com.bengisusahin.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("James",50)
        myUser.name = "Lars"
        myUser.age = 60
        //bunlari baslatmazsak null donuyor
//        myUser.age = 25
//        myUser.name = "James"

        println(myUser.age) //atilda yazdirmadi .toString kullandi
        println(myUser.name)

        //encapsulation
        var james = Musician("James", "Guitar", 55)
        //james.age = 60 private set yaptiktan sonra yoruma aldık
        println(james.age)
        println(james.returnBandName("Atil"))
        println(james.returnBandName("Kirk"))

        //inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("Atil"))
        lars.sing()
    }
}