package com.prateekthakur272.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OptionMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
        val gameActivity:Intent = Intent(this,TicTacToeBoard::class.java)
        val vsHuman:ImageView = findViewById(R.id.vs_human)
        val vsBot:ImageView = findViewById(R.id.vs_bot)

        vsBot.setOnClickListener {
            startActivity(gameActivity)
        }
        vsHuman.setOnClickListener {
            startActivity(gameActivity)
        }
    }
}