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

        //polymorphism aynı ismi kullanarak farklı işlemler yapabilme
        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test() //super.sing i yani animaldaki singi cagiracak
        barley.sing()
    }
}