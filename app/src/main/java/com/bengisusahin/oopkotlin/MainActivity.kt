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
        println(myUser.information())

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

        //abstract & interface
        //abstract sizin bir obje instance oluşturamayacağınız bir sınıfır
        //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda epressions bir input isenip output verilir
        fun printString(myString : String){
            println(myString)
        }

        printString("My test string")

        val testString = {myString : String -> println(myString) }

        testString("My lambda string")

        val multiplyLambda = {a: Int, b: Int -> a*b}
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))

        //asyncrnous
        //callback func, listener func, completion func
        //fun downloadMusicians(url: String, completion: () -> Unit){ //bos bisi bos bisi dondurcek
        fun downloadMusicians(url: String, completion: (Musician) -> Unit){ //bos bisi bos bisi dondurcek
           //url -> download
            //data
            val kirkHammet = Musician("Kirk", "Guitar",60)
            completion(kirkHammet)
        }

//        downloadMusicians("metallica.com", {
//            //println("completed && ready")
//            println(it.name)
//        })
        downloadMusicians("metallica.com", { musician ->
            //println("completed && ready")
            println(musician.name)
        })
    }
}