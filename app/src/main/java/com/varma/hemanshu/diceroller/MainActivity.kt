package com.varma.hemanshu.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        //Click Listener for Button
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val imageResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_2
            4 -> R.drawable.dice_2
            5 -> R.drawable.dice_2
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(imageResource)
    }
}
