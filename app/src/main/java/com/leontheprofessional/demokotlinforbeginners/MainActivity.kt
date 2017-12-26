package com.leontheprofessional.demokotlinforbeginners

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var greeting: String = "Hello World!"
        greeting = "Hello Kotlin!"

        var language: String = "Kotlin"
        var creator: String = "JetBrains"
        var description: String = language + " is created by " + creator

        var num1: Int = 42
        var num2: Double = 3.14
        var numLong: Long = 23
        var numFloat: Float = 23.13.toFloat()

        var numWithUndercore:Int = 92_960_000 // inferred as type Int

        var nullInt: Int? = null // Variables ONLY with question mark can be set to null
        var nullString: String? = null
        println(nullString?.length) // safe call: pints "null"

        nullString = "Treehouse"
        println(nullString!!.length)

        // Collections
        val cardNames = arrayOf("Jack", "Queen", "King")
        val firstCardName = cardNames[0]
        cardNames[0] = "Ace"

        val cards = mutableListOf("Jack", "Queen", "King")

        // using a MutableList gives us several options for adding/removing them
        val cardsInMutableList = mutableListOf("Jack", "Queen", "King")
        cardsInMutableList.add("Ace")
        cardsInMutableList.remove("Jack")
        cardsInMutableList.clear()

        // This went wrong, even though I do NOT know why
        // cardsInMutableList.addAll("Jack", "Queen", "King", "Ace")

        // Collection - Map
        val cardsInMap = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
        val jackValue = cardsInMap["Jack"]

        // Change it to a MutableMap then one can add new values
        val cardsInMutableMap = mutableMapOf("Jack" to 11, "Queen" to 12, "King" to 13)
        cardsInMutableMap["Ace"] = 1

        // one can also use [function]toMutableMap to turn a Map into a MutableMap
        val cardsInMutableMap2 = cardsInMap.toMutableMap()
        cardsInMutableMap2["Ace"] = 2


    }
}
