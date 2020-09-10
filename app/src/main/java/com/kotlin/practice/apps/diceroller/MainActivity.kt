package com.kotlin.practice.apps.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        //remember this is bad for performance because every time the button clicked we find the text by id we will change it latter
        val rollText: TextView = findViewById(R.id.roll_number_text)
        //get random number between 1 to 5 and add 1 to get from 1 to 6
        val randomInt = java.util.Random().nextInt(6) + 1
        rollText.text = randomInt.toString()
    }
}