package com.prateekthakur272.tictactoe

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

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
        val message:TextView = findViewById(R.id.message)

        var currentMark:Int = R.drawable.x_mark

        mark0.setOnClickListener {
            mark0.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark0.isClickable = false
        }
        mark1.setOnClickListener {
            mark1.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark1.isClickable = false
        }
        mark2.setOnClickListener {
            mark2.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark2.isClickable = false
        }
        mark3.setOnClickListener {
            mark3.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark3.isClickable = false
        }
        mark4.setOnClickListener {
            mark4.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark4.isClickable = false
        }
        mark5.setOnClickListener {
            mark5.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark5.isClickable = false
        }
        mark6.setOnClickListener {
            mark6.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark6.isClickable = false
        }
        mark7.setOnClickListener {
            mark7.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark7.isClickable = false
        }
        mark8.setOnClickListener {
            mark8.setImageResource(currentMark)
            currentMark = getNextMarker(currentMark)
            mark8.isClickable = false
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
            currentMark = R.drawable.x_mark
        }
        resetButton.setOnClickListener {
            reset()
        }
    }
    fun getNextMarker(currentMark:Int):Int{
        if(currentMark == R.drawable.x_mark)
            return R.drawable.o_mark
        return R.drawable.x_mark
    }
}