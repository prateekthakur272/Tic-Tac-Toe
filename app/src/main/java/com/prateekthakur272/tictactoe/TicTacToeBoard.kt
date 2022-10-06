package com.prateekthakur272.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TicTacToeBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe_board)
        val mark0:ImageView = findViewById(R.id.mark0)
        val mark1:ImageView = findViewById(R.id.mark1)
        val mark2:ImageView = findViewById(R.id.mark2)
        val mark3:ImageView = findViewById(R.id.mark3)
        val mark4:ImageView = findViewById(R.id.mark4)
        val mark5:ImageView = findViewById(R.id.mark5)
        val mark6:ImageView = findViewById(R.id.mark6)
        val mark7:ImageView = findViewById(R.id.mark7)
        val mark8:ImageView = findViewById(R.id.mark8)
        val resetButton:Button = findViewById(R.id.reset)
        var game: TicTacToe = TicTacToe()

        fun checkWinner(){
            val winner:Int
            if (game.isWinner()) {
                winner = if (game.current == R.drawable.x_mark) R.drawable.o_mark else R.drawable.x_mark
                mark0.setImageResource(winner)
                mark1.setImageResource(winner)
                mark2.setImageResource(winner)
                mark3.setImageResource(winner)
                mark4.setImageResource(winner)
                mark5.setImageResource(winner)
                mark6.setImageResource(winner)
                mark7.setImageResource(winner)
                mark8.setImageResource(winner)
            }
        }
        mark0.setOnClickListener {
            mark0.setImageResource(game.current)
            game.mark(0)
            mark0.isClickable = false
            checkWinner()
        }
        mark1.setOnClickListener {
            mark1.setImageResource(game.current)
            game.mark(1)
            mark1.isClickable = false
            checkWinner()
        }
        mark2.setOnClickListener {
            mark2.setImageResource(game.current)
            game.mark(2)
            mark2.isClickable = false
            checkWinner()
        }
        mark3.setOnClickListener {
            mark3.setImageResource(game.current)
            game.mark(3)
            mark3.isClickable = false
            checkWinner()
        }
        mark4.setOnClickListener {
            mark4.setImageResource(game.current)
            game.mark(4)
            mark4.isClickable = false
            checkWinner()
        }
        mark5.setOnClickListener {
            mark5.setImageResource(game.current)
            game.mark(5)
            mark5.isClickable = false
            checkWinner()
        }
        mark6.setOnClickListener {
            mark6.setImageResource(game.current)
            game.mark(6)
            mark6.isClickable = false
            checkWinner()
        }
        mark7.setOnClickListener {
            mark7.setImageResource(game.current)
            game.mark(7)
            mark7.isClickable = false
            checkWinner()
        }
        mark8.setOnClickListener {
            mark8.setImageResource(game.current)
            game.mark(8)
            mark8.isClickable = false
            checkWinner()
        }
        fun reset(){
            mark0.setImageDrawable(null)
            mark0.isClickable = true
            mark1.setImageDrawable(null)
            mark1.isClickable = true
            mark2.setImageDrawable(null)
            mark2.isClickable = true
            mark3.setImageDrawable(null)
            mark3.isClickable = true
            mark4.setImageDrawable(null)
            mark4.isClickable = true
            mark5.setImageDrawable(null)
            mark5.isClickable = true
            mark6.setImageDrawable(null)
            mark6.isClickable = true
            mark7.setImageDrawable(null)
            mark7.isClickable = true
            mark8.setImageDrawable(null)
            mark8.isClickable = true
            game = TicTacToe()
        }
        resetButton.setOnClickListener {
            reset()
        }
    }
}