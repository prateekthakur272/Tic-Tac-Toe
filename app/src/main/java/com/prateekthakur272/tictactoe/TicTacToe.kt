package com.prateekthakur272.tictactoe

import android.graphics.drawable.Drawable
import kotlin.experimental.and

open class TicTacToe {
    protected val boardArray:Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0)
    open var current = R.drawable.x_mark
    open fun mark(pos: Int){
        if (pos<=8)
            if (boardArray[pos] == 0) {
                boardArray[pos] = current
                nextMark()
            }else throw Exception("Block occupied already")
        else throw Exception("Out of Board")
    }
    private fun nextMark(){
        if (current == R.drawable.x_mark)
            current = R.drawable.o_mark
        else if (current == R.drawable.o_mark)
            current = R.drawable.x_mark
    }
    fun isWinner():Boolean{
        return if(boardArray[0] == boardArray[1] && boardArray[1] == boardArray[2] && boardArray[0]!= 0) true else
            if (boardArray[3] == boardArray[4] && boardArray[4] == boardArray[5] && boardArray[3]!= 0) true else
                if (boardArray[6] == boardArray[7] && boardArray[7] == boardArray[8] && boardArray[6]!= 0) true else
                    if (boardArray[0] == boardArray[3] && boardArray[3] == boardArray[6] && boardArray[0]!= 0) true else
                        if (boardArray[1] == boardArray[4] && boardArray[4] == boardArray[7] && boardArray[1]!= 0) true else
                            if (boardArray[2] == boardArray[5] && boardArray[5] == boardArray[8] && boardArray[2]!= 0) true else
                                if (boardArray[0] == boardArray[4] && boardArray[4] == boardArray[8] && boardArray[0]!= 0) true else
                                    boardArray[2] == boardArray[4] && boardArray[4] == boardArray[6] && boardArray[2]!= 0
    }
}