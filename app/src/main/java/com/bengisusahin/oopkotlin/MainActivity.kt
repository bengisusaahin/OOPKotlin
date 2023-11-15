package com.bengisusahin.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User()
        //bunlari baslatmazsak null donuyor
        myUser.age = 25
        myUser.name = "James"

        println(myUser.age) //atilda yazdirmadi .toString kullandi
        println(myUser.name)
    }
}