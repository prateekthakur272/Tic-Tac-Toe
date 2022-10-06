package com.prateekthakur272.tictactoe
class TicTacToeComputer:TicTacToe() {
    var lastMark:Int = R.drawable.x_mark
    val availableBlocks:MutableList<Int> = mutableListOf<Int>(0,1,2,3,4,5,6,7,8)
    fun mark(): Int {
        if (availableBlocks.isEmpty())
            return -1
        val blockIndex:Int = availableBlocks[(0 until availableBlocks.size).random()]
        availableBlocks.remove(blockIndex)
        boardArray[blockIndex] = R.drawable.o_mark
        lastMark = R.drawable.o_mark
        return blockIndex
    }
    override fun mark(pos:Int) {
        lastMark = R.drawable.x_mark
        boardArray[pos] = R.drawable.x_mark
        availableBlocks.remove(pos)
    }
}