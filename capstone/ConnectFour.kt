package com.example.capstone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ConnectFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect_four)

        var column1 = 0
        var column2 = 0
        var column3 = 0
        var column4 = 0
        var column5 = 0
        var column6 = 0
        var column7 = 0
        var turn = 0
        var rScore = mutableListOf<Int>()
        var yScore = mutableListOf<Int>()
        val board1 = findViewById<ImageView>(R.id.ivC1)
        val board2 = findViewById<ImageView>(R.id.ivC2)
        val board3 = findViewById<ImageView>(R.id.ivC3)
        val board4 = findViewById<ImageView>(R.id.ivC4)
        val board5 = findViewById<ImageView>(R.id.ivC5)
        val board6 = findViewById<ImageView>(R.id.ivC6)
        val board7 = findViewById<ImageView>(R.id.ivC7)
        val board8 = findViewById<ImageView>(R.id.ivC8)
        val board9 = findViewById<ImageView>(R.id.ivC9)
        val board10 = findViewById<ImageView>(R.id.ivC10)
        val board11 = findViewById<ImageView>(R.id.ivC11)
        val board12 = findViewById<ImageView>(R.id.ivC12)
        val board13 = findViewById<ImageView>(R.id.ivC13)
        val board14 = findViewById<ImageView>(R.id.ivC14)
        val board15 = findViewById<ImageView>(R.id.ivC15)
        val board16 = findViewById<ImageView>(R.id.ivC16)
        val board17 = findViewById<ImageView>(R.id.ivC17)
        val board18 = findViewById<ImageView>(R.id.ivC18)
        val board19 = findViewById<ImageView>(R.id.ivC19)
        val board20 = findViewById<ImageView>(R.id.ivC20)
        val board21 = findViewById<ImageView>(R.id.ivC21)
        val board22 = findViewById<ImageView>(R.id.ivC22)
        val board23 = findViewById<ImageView>(R.id.ivC23)
        val board24 = findViewById<ImageView>(R.id.ivC24)
        val board25 = findViewById<ImageView>(R.id.ivC25)
        val board26 = findViewById<ImageView>(R.id.ivC26)
        val board27 = findViewById<ImageView>(R.id.ivC27)
        val board28 = findViewById<ImageView>(R.id.ivC28)
        val board29 = findViewById<ImageView>(R.id.ivC29)
        val board30 = findViewById<ImageView>(R.id.ivC30)
        val board31 = findViewById<ImageView>(R.id.ivC31)
        val board32 = findViewById<ImageView>(R.id.ivC32)
        val board33 = findViewById<ImageView>(R.id.ivC33)
        val board34 = findViewById<ImageView>(R.id.ivC34)
        val board35 = findViewById<ImageView>(R.id.ivC35)
        val board36 = findViewById<ImageView>(R.id.ivC36)
        val board37 = findViewById<ImageView>(R.id.ivC37)
        val board38 = findViewById<ImageView>(R.id.ivC38)
        val board39 = findViewById<ImageView>(R.id.ivC39)
        val board40 = findViewById<ImageView>(R.id.ivC40)
        val board41 = findViewById<ImageView>(R.id.ivC41)
        val board42 = findViewById<ImageView>(R.id.ivC42)
        val btnResetC4 = findViewById<Button>(R.id.btnResetConnectFour)
        val btnColumn1 = findViewById<Button>(R.id.btnDrop1)
        val btnColumn2 = findViewById<Button>(R.id.btnDrop2)
        val btnColumn3 = findViewById<Button>(R.id.btnDrop3)
        val btnColumn4 = findViewById<Button>(R.id.btnDrop4)
        val btnColumn5 = findViewById<Button>(R.id.btnDrop5)
        val btnColumn6 = findViewById<Button>(R.id.btnDrop6)
        val btnColumn7 = findViewById<Button>(R.id.btnDrop7)
        val tvConnectFourWin = findViewById<TextView>(R.id.tvConnectFourWinner)

        btnColumn1.setOnClickListener{
            if(column1 == 0){
                if(turn == 0)
                {
                    board1.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(1)
                }
                else
                {
                    board1.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(1)
                }
            }
            else if(column1 == 1){
                if(turn == 0)
                {
                    board8.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(8)
                }
                else
                {
                    board8.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(8)
                }
            }
            else if(column1 == 2){
                if(turn == 0)
                {
                    board15.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(15)
                }
                else
                {
                    board15.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(15)
                }
            }
            else if(column1 == 3){
                if(turn == 0)
                {
                    board22.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(22)
                }
                else
                {
                    board22.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(22)
                }
            }
            else if(column1 == 4){
                if(turn == 0)
                {
                    board29.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(29)
                }
                else
                {
                    board29.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(29)
                }
            }
            else if(column1 == 5){
                if(turn == 0)
                {
                    board36.setImageResource(R.drawable.redchip)
                    column1++
                    turn = 1
                    rScore.add(36)
                    btnColumn1.isEnabled = false
                }
                else
                {
                    board36.setImageResource(R.drawable.yellowchip)
                    column1++
                    turn = 0
                    yScore.add(36)
                    btnColumn1.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
            for(i in 1 .. 21)
            {
                if(rScore.contains(i) && rScore.contains(i+7) && rScore.contains(i+14) && rScore.contains(i+21))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+7) && yScore.contains(i+14) && yScore.contains(i+21))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }

        }
        btnColumn2.setOnClickListener{
            if(column2 == 0){
                if(turn == 0)
                {
                    board2.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(2)
                }
                else
                {
                    board2.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(2)
                }
            }
            else if(column2 == 1){
                if(turn == 0)
                {
                    board9.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(9)
                }
                else
                {
                    board9.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(9)
                }
            }
            else if(column2 == 2){
                if(turn == 0)
                {
                    board16.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(16)
                }
                else
                {
                    board16.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(16)
                }
            }
            else if(column2 == 3){
                if(turn == 0)
                {
                    board23.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(23)
                }
                else
                {
                    board23.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(23)
                }
            }
            else if(column2 == 4){
                if(turn == 0)
                {
                    board30.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(30)
                }
                else
                {
                    board30.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(30)
                }
            }
            else if(column2 == 5){
                if(turn == 0)
                {
                    board37.setImageResource(R.drawable.redchip)
                    column2++
                    turn = 1
                    rScore.add(37)
                    btnColumn2.isEnabled = false
                }
                else
                {
                    board37.setImageResource(R.drawable.yellowchip)
                    column2++
                    turn = 0
                    yScore.add(37)
                    btnColumn2.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnColumn3.setOnClickListener{
            if(column3 == 0){
                if(turn == 0)
                {
                    board3.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(3)
                }
                else
                {
                    board3.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(3)
                }
            }
            else if(column3 == 1){
                if(turn == 0)
                {
                    board10.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(10)
                }
                else
                {
                    board10.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(10)
                }
            }
            else if(column3 == 2){
                if(turn == 0)
                {
                    board17.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(17)
                }
                else
                {
                    board17.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(17)
                }
            }
            else if(column3 == 3){
                if(turn == 0)
                {
                    board24.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(24)
                }
                else
                {
                    board24.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(24)
                }
            }
            else if(column3 == 4){
                if(turn == 0)
                {
                    board31.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(31)
                }
                else
                {
                    board31.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(31)
                }
            }
            else if(column3 == 5){
                if(turn == 0)
                {
                    board38.setImageResource(R.drawable.redchip)
                    column3++
                    turn = 1
                    rScore.add(38)
                    btnColumn3.isEnabled = false
                }
                else
                {
                    board38.setImageResource(R.drawable.yellowchip)
                    column3++
                    turn = 0
                    yScore.add(38)
                    btnColumn3.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnColumn4.setOnClickListener{
            if(column4 == 0){
                if(turn == 0)
                {
                    board4.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(4)
                }
                else
                {
                    board4.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(4)
                }
            }
            else if(column4 == 1){
                if(turn == 0)
                {
                    board11.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(11)
                }
                else
                {
                    board11.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(11)
                }
            }
            else if(column4 == 2){
                if(turn == 0)
                {
                    board18.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(18)
                }
                else
                {
                    board18.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(18)
                }
            }
            else if(column4 == 3){
                if(turn == 0)
                {
                    board25.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(25)
                }
                else
                {
                    board25.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(25)
                }
            }
            else if(column4 == 4){
                if(turn == 0)
                {
                    board32.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(32)
                }
                else
                {
                    board32.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(32)
                }
            }
            else if(column4 == 5){
                if(turn == 0)
                {
                    board39.setImageResource(R.drawable.redchip)
                    column4++
                    turn = 1
                    rScore.add(39)
                    btnColumn4.isEnabled = false
                }
                else
                {
                    board39.setImageResource(R.drawable.yellowchip)
                    column4++
                    turn = 0
                    yScore.add(39)
                    btnColumn4.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnColumn5.setOnClickListener{
            if(column5 == 0){
                if(turn == 0)
                {
                    board5.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(5)
                }
                else
                {
                    board5.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(5)
                }
            }
            else if(column5 == 1){
                if(turn == 0)
                {
                    board12.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(12)
                }
                else
                {
                    board12.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(12)
                }
            }
            else if(column5 == 2){
                if(turn == 0)
                {
                    board19.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(19)
                }
                else
                {
                    board19.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(19)
                }
            }
            else if(column5 == 3){
                if(turn == 0)
                {
                    board24.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(24)
                }
                else
                {
                    board26.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(26)
                }
            }
            else if(column5 == 4){
                if(turn == 0)
                {
                    board33.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(33)
                }
                else
                {
                    board33.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(33)
                }
            }
            else if(column5 == 5){
                if(turn == 0)
                {
                    board40.setImageResource(R.drawable.redchip)
                    column5++
                    turn = 1
                    rScore.add(40)
                    btnColumn5.isEnabled = false
                }
                else
                {
                    board40.setImageResource(R.drawable.yellowchip)
                    column5++
                    turn = 0
                    yScore.add(40)
                    btnColumn5.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnColumn6.setOnClickListener{
            if(column6 == 0){
                if(turn == 0)
                {
                    board6.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(6)
                }
                else
                {
                    board6.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(6)
                }
            }
            else if(column6 == 1){
                if(turn == 0)
                {
                    board13.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(13)
                }
                else
                {
                    board13.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(13)
                }
            }
            else if(column6 == 2){
                if(turn == 0)
                {
                    board20.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(20)
                }
                else
                {
                    board20.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(20)
                }
            }
            else if(column6 == 3){
                if(turn == 0)
                {
                    board27.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(27)
                }
                else
                {
                    board27.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(27)
                }
            }
            else if(column6 == 4){
                if(turn == 0)
                {
                    board34.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(34)
                }
                else
                {
                    board34.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(34)
                }
            }
            else if(column6 == 5){
                if(turn == 0)
                {
                    board41.setImageResource(R.drawable.redchip)
                    column6++
                    turn = 1
                    rScore.add(41)
                    btnColumn6.isEnabled = false
                }
                else
                {
                    board41.setImageResource(R.drawable.yellowchip)
                    column6++
                    turn = 0
                    yScore.add(41)
                    btnColumn6.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnColumn7.setOnClickListener{
            if(column7 == 0){
                if(turn == 0)
                {
                    board7.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(7)
                }
                else
                {
                    board7.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(7)
                }
            }
            else if(column7 == 1){
                if(turn == 0)
                {
                    board14.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(14)
                }
                else
                {
                    board14.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(14)
                }
            }
            else if(column7 == 2){
                if(turn == 0)
                {
                    board21.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(21)
                }
                else
                {
                    board21.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(21)
                }
            }
            else if(column7 == 3){
                if(turn == 0)
                {
                    board28.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(28)
                }
                else
                {
                    board28.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(28)
                }
            }
            else if(column7 == 4){
                if(turn == 0)
                {
                    board35.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(35)
                }
                else
                {
                    board35.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(35)
                }
            }
            else if(column7 == 5){
                if(turn == 0)
                {
                    board42.setImageResource(R.drawable.redchip)
                    column7++
                    turn = 1
                    rScore.add(42)
                    btnColumn7.isEnabled = false
                }
                else
                {
                    board42.setImageResource(R.drawable.yellowchip)
                    column7++
                    turn = 0
                    yScore.add(42)
                    btnColumn7.isEnabled = false
                }
            }
            for(i in 1 .. 4)
            {
                if(rScore.contains(i) && rScore.contains(i+1) && rScore.contains(i+2) && rScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 7) && rScore.contains(i+8) && rScore.contains(i+9) && rScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 14) && rScore.contains(i+15) && rScore.contains(i+16) && rScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 21) && rScore.contains(i+22) && rScore.contains(i+23) && rScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 28) && rScore.contains(i+29) && rScore.contains(i+30) && rScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(rScore.contains(i + 35) && rScore.contains(i+36) && rScore.contains(i+37) && rScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Red Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i) && yScore.contains(i+1) && yScore.contains(i+2) && yScore.contains(i+3))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 7) && yScore.contains(i+8) && yScore.contains(i+9) && yScore.contains(i + 10))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 14) && yScore.contains(i+15) && yScore.contains(i+16) && yScore.contains(i + 17))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 21) && yScore.contains(i+22) && yScore.contains(i+23) && yScore.contains(i + 24))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 28) && yScore.contains(i+29) && yScore.contains(i+30) && yScore.contains(i + 31))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
                else if(yScore.contains(i + 35) && yScore.contains(i+36) && yScore.contains(i+37) && yScore.contains(i + 38))
                {
                    tvConnectFourWin.setText("Yellow Wins this Match")
                    btnColumn1.isEnabled = false
                    btnColumn2.isEnabled = false
                    btnColumn3.isEnabled = false
                    btnColumn4.isEnabled = false
                    btnColumn5.isEnabled = false
                    btnColumn6.isEnabled = false
                    btnColumn7.isEnabled = false
                }
            }
        }
        btnResetC4.setOnClickListener{
            board1.setImageResource(R.drawable.board)
            board2.setImageResource(R.drawable.board)
            board3.setImageResource(R.drawable.board)
            board4.setImageResource(R.drawable.board)
            board5.setImageResource(R.drawable.board)
            board6.setImageResource(R.drawable.board)
            board7.setImageResource(R.drawable.board)
            board8.setImageResource(R.drawable.board)
            board9.setImageResource(R.drawable.board)
            board10.setImageResource(R.drawable.board)
            board11.setImageResource(R.drawable.board)
            board12.setImageResource(R.drawable.board)
            board13.setImageResource(R.drawable.board)
            board14.setImageResource(R.drawable.board)
            board15.setImageResource(R.drawable.board)
            board16.setImageResource(R.drawable.board)
            board17.setImageResource(R.drawable.board)
            board18.setImageResource(R.drawable.board)
            board19.setImageResource(R.drawable.board)
            board20.setImageResource(R.drawable.board)
            board21.setImageResource(R.drawable.board)
            board22.setImageResource(R.drawable.board)
            board23.setImageResource(R.drawable.board)
            board24.setImageResource(R.drawable.board)
            board25.setImageResource(R.drawable.board)
            board26.setImageResource(R.drawable.board)
            board27.setImageResource(R.drawable.board)
            board28.setImageResource(R.drawable.board)
            board29.setImageResource(R.drawable.board)
            board30.setImageResource(R.drawable.board)
            board31.setImageResource(R.drawable.board)
            board32.setImageResource(R.drawable.board)
            board33.setImageResource(R.drawable.board)
            board34.setImageResource(R.drawable.board)
            board35.setImageResource(R.drawable.board)
            board36.setImageResource(R.drawable.board)
            board37.setImageResource(R.drawable.board)
            board38.setImageResource(R.drawable.board)
            board39.setImageResource(R.drawable.board)
            board40.setImageResource(R.drawable.board)
            board41.setImageResource(R.drawable.board)
            board42.setImageResource(R.drawable.board)
            btnColumn1.isEnabled = true
            btnColumn2.isEnabled = true
            btnColumn3.isEnabled = true
            btnColumn4.isEnabled = true
            btnColumn5.isEnabled = true
            btnColumn6.isEnabled = true
            btnColumn7.isEnabled = true
            column1 = 0
            column2 = 0
            column3 = 0
            column4 = 0
            column5 = 0
            column6 = 0
            column7 = 0
            turn = 0
            rScore.clear()
            yScore.clear()
            tvConnectFourWin.setText("There is no winnner for this match yet")
        }
    }
}