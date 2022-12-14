package com.example.capstone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val bUL = findViewById<ImageButton>(R.id.button)
        val bUM = findViewById<ImageButton>(R.id.button2)
        val bUR = findViewById<ImageButton>(R.id.button3)
        val bML = findViewById<ImageButton>(R.id.button4)
        val bMM = findViewById<ImageButton>(R.id.button5)
        val bMR = findViewById<ImageButton>(R.id.button6)
        val bBL = findViewById<ImageButton>(R.id.button7)
        val bBM = findViewById<ImageButton>(R.id.button8)
        val bBR = findViewById<ImageButton>(R.id.button9)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val winner = findViewById<TextView>(R.id.tvWinTic)
        var turn = 0
        var xScore = mutableListOf<Int>()
        var oScore = mutableListOf<Int>()
        val win1 = arrayListOf<Int>(1,2,3)
        val win2 = arrayListOf<Int>(1,5,9)
        val win3 = arrayListOf<Int>(1,4,7)
        val win4 = arrayListOf<Int>(2,5,8)
        val win5 = arrayListOf<Int>(3,6,9)
        val win6 = arrayListOf<Int>(3,5,7)
        val win7 = arrayListOf<Int>(4,5,6)
        val win8 = arrayListOf<Int>(7,8,9)

        bUL.setOnClickListener{
            if(turn == 0)
            {
                bUL.setImageResource(R.drawable.xletter)
                turn = 1
                bUL.isEnabled = false
                xScore.add(1)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bUL.setImageResource(R.drawable.oletter)
                turn = 0
                bUL.isEnabled = false
                oScore.add(1)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bUM.setOnClickListener{
            if(turn == 0)
            {
                bUM.setImageResource(R.drawable.xletter)
                turn = 1
                bUM.isEnabled = false
                xScore.add(2)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bUM.setImageResource(R.drawable.oletter)
                turn = 0
                bUM.isEnabled = false
                oScore.add(2)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bUR.setOnClickListener{
            if(turn == 0)
            {
                bUR.setImageResource(R.drawable.xletter)
                turn = 1
                bUR.isEnabled = false
                xScore.add(3)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bUR.setImageResource(R.drawable.oletter)
                turn = 0
                bUR.isEnabled = false
                oScore.add(3)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bML.setOnClickListener{
            if(turn == 0)
            {
                bML.setImageResource(R.drawable.xletter)
                turn = 1
                bML.isEnabled = false
                xScore.add(4)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bML.setImageResource(R.drawable.oletter)
                turn = 0
                bML.isEnabled = false
                oScore.add(4)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bMM.setOnClickListener{
            if(turn == 0)
            {
                bMM.setImageResource(R.drawable.xletter)
                turn = 1
                bMM.isEnabled = false
                xScore.add(5)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bMM.setImageResource(R.drawable.oletter)
                turn = 0
                bMM.isEnabled = false
                oScore.add(5)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bMR.setOnClickListener{
            if(turn == 0)
            {
                bMR.setImageResource(R.drawable.xletter)
                turn = 1
                bMR.isEnabled = false
                xScore.add(6)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bMR.setImageResource(R.drawable.oletter)
                turn = 0
                bMR.isEnabled = false
                oScore.add(6)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bBL.setOnClickListener{
            if(turn == 0)
            {
                bBL.setImageResource(R.drawable.xletter)
                turn = 1
                bBL.isEnabled = false
                xScore.add(7)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bBL.setImageResource(R.drawable.oletter)
                turn = 0
                bBL.isEnabled = false
                oScore.add(7)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bBM.setOnClickListener{
            if(turn == 0)
            {
                bBM.setImageResource(R.drawable.xletter)
                turn = 1
                bBM.isEnabled = false
                xScore.add(8)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                    Toast.makeText(applicationContext, "Hello", Toast.LENGTH_LONG).show()
                }
            }
            else
            {
                bBM.setImageResource(R.drawable.oletter)
                turn = 0
                bBM.isEnabled = false
                oScore.add(8)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        bBR.setOnClickListener{
            if(turn == 0)
            {
                bBR.setImageResource(R.drawable.xletter)
                turn = 1
                bBR.isEnabled = false
                xScore.add(9)
                if(xScore.containsAll(win1) || xScore.containsAll(win2)|| xScore.containsAll(win3)
                    ||xScore.containsAll(win4)||xScore.containsAll(win5)||xScore.containsAll(win6)
                    ||xScore.containsAll(win7)||xScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is X")
                }
            }
            else
            {
                bBR.setImageResource(R.drawable.oletter)
                turn = 0
                bBR.isEnabled = false
                oScore.add(9)
                if(oScore.containsAll(win1) || oScore.containsAll(win2)|| oScore.containsAll(win3)
                    ||oScore.containsAll(win4)||oScore.containsAll(win5)||oScore.containsAll(win6)
                    ||oScore.containsAll(win7)||oScore.containsAll(win8))
                {
                    bUL.isEnabled = false
                    bUM.isEnabled = false
                    bUR.isEnabled = false
                    bML.isEnabled = false
                    bMM.isEnabled = false
                    bMR.isEnabled = false
                    bBL.isEnabled = false
                    bBM.isEnabled = false
                    bBR.isEnabled = false
                    winner.setText("The winner of this match is 0")
                }
            }

        }
        btnReset.setOnClickListener{
            bUL.isEnabled = true
            bUL.setImageResource(R.drawable.button)
            bUM.isEnabled = true
            bUM.setImageResource(R.drawable.button)
            bUR.isEnabled = true
            bUR.setImageResource(R.drawable.button)
            bML.isEnabled = true
            bML.setImageResource(R.drawable.button)
            bMM.isEnabled = true
            bMM.setImageResource(R.drawable.button)
            bMR.isEnabled = true
            bMR.setImageResource(R.drawable.button)
            bBL.isEnabled = true
            bBL.setImageResource(R.drawable.button)
            bBM.isEnabled = true
            bBM.setImageResource(R.drawable.button)
            bBR.isEnabled = true
            bBR.setImageResource(R.drawable.button)
            xScore.clear()
            oScore.clear()
            winner.setText("There is no winner of this match yet")
            turn = 0
        }
    }
}