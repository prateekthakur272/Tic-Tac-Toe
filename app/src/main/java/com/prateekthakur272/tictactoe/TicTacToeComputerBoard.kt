package com.prateekthakur272.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class TicTacToeComputerBoard : AppCompatActivity() {
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
        val resetButton: Button = findViewById(R.id.reset)
        var game = TicTacToeComputer()

        fun checkWinner(){
            val winner:Int
            if (game.isWinner()) {
                winner =  game.lastMark
                mark0.setImageResource(winner)
                mark0.isClickable =false
                mark1.setImageResource(winner)
                mark1.isClickable =false
                mark2.setImageResource(winner)
                mark2.isClickable =false
                mark3.setImageResource(winner)
                mark3.isClickable =false
                mark4.setImageResource(winner)
                mark4.isClickable =false
                mark5.setImageResource(winner)
                mark5.isClickable =false
                mark6.setImageResource(winner)
                mark6.isClickable =false
                mark7.setImageResource(winner)
                mark7.isClickable =false
                mark8.setImageResource(winner)
                mark8.isClickable =false
            }
        }

        fun computerMark(){
            val computerMark = game.mark()
            if (computerMark != -1) {
                when (computerMark) {
                    0 -> {
                        mark0.setImageResource(R.drawable.o_mark)
                        mark0.isClickable = false
                    }
                    1 -> {
                        mark1.setImageResource(R.drawable.o_mark)
                        mark1.isClickable = false
                    }
                    2 -> {
                        mark2.setImageResource(R.drawable.o_mark)
                        mark2.isClickable = false
                    }
                    3 -> {
                        mark3.setImageResource(R.drawable.o_mark)
                        mark3.isClickable = false
                    }
                    4 -> {
                        mark4.setImageResource(R.drawable.o_mark)
                        mark4.isClickable = false
                    }
                    5 -> {
                        mark5.setImageResource(R.drawable.o_mark)
                        mark5.isClickable = false
                    }
                    6 -> {
                        mark6.setImageResource(R.drawable.o_mark)
                        mark6.isClickable = false
                    }
                    7 -> {
                        mark7.setImageResource(R.drawable.o_mark)
                        mark7.isClickable = false
                    }
                    8 -> {
                        mark8.setImageResource(R.drawable.o_mark)
                        mark8.isClickable = false
                    }
                }
            }
        }
        mark0.setOnClickListener {
            mark0.setImageResource(R.drawable.x_mark)
            game.mark(0)
            mark0.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark1.setOnClickListener {
            mark1.setImageResource(R.drawable.x_mark)
            game.mark(1)
            mark1.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark2.setOnClickListener {
            mark2.setImageResource(R.drawable.x_mark)
            game.mark(2)
            mark2.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark3.setOnClickListener {
            mark3.setImageResource(R.drawable.x_mark)
            game.mark(3)
            mark3.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark4.setOnClickListener {
            mark4.setImageResource(R.drawable.x_mark)
            game.mark(4)
            mark4.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark5.setOnClickListener {
            mark5.setImageResource(R.drawable.x_mark)
            game.mark(5)
            mark5.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark6.setOnClickListener {
            mark6.setImageResource(R.drawable.x_mark)
            game.mark(6)
            mark6.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark7.setOnClickListener {
            mark7.setImageResource(R.drawable.x_mark)
            game.mark(7)
            mark7.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
        }
        mark8.setOnClickListener {
            mark8.setImageResource(R.drawable.x_mark)
            game.mark(8)
            mark8.isClickable = false
            checkWinner()
            if (!game.isWinner()){
                computerMark()
                checkWinner()
            }
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
            game = TicTacToeComputer()
        }
        resetButton.setOnClickListener {
            reset()
        }
    }
}