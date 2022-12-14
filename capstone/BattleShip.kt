package com.example.capstone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class BattleShip : AppCompatActivity() {
    var acc=0.0
    var hit=0.0
    var total=0.0
    lateinit var txtAcc: TextView
    lateinit var txtHit: TextView
    lateinit var txtTaken: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle_ship)
        txtAcc = findViewById(R.id.txtAcc)
        txtHit = findViewById(R.id.txtHit)
        txtTaken = findViewById(R.id.txtTaken)
        val buttons = arrayOf(
            findViewById(R.id.spot1),findViewById(R.id.spot2),findViewById(R.id.spot3),findViewById(R.id.spot4),findViewById(R.id.spot5),findViewById(R.id.spot6),findViewById(R.id.spot7),findViewById(R.id.spot8),findViewById(R.id.spot9),findViewById(R.id.spot10),
            findViewById(R.id.spot11),findViewById(R.id.spot12),findViewById(R.id.spot13),findViewById(R.id.spot14),findViewById(R.id.spot15),findViewById(R.id.spot16),findViewById(R.id.spot17),findViewById(R.id.spot18),findViewById(R.id.spot19),findViewById(R.id.spot20),
            findViewById(R.id.spot21),findViewById(R.id.spot22),findViewById(R.id.spot23),findViewById(R.id.spot24),findViewById(R.id.spot25),findViewById(R.id.spot26),findViewById(R.id.spot27),findViewById(R.id.spot28),findViewById(R.id.spot29),findViewById(R.id.spot30),
            findViewById(R.id.spot31),findViewById(R.id.spot32),findViewById(R.id.spot33),findViewById(R.id.spot34),findViewById(R.id.spot35),findViewById(R.id.spot36),findViewById(R.id.spot37),findViewById(R.id.spot38),findViewById(R.id.spot39),findViewById(R.id.spot40),
            findViewById(R.id.spot41),findViewById(R.id.spot42),findViewById(R.id.spot43),findViewById(R.id.spot44),findViewById(R.id.spot45),findViewById(R.id.spot46),findViewById(R.id.spot47),findViewById(R.id.spot48),findViewById(R.id.spot49),findViewById(R.id.spot50),
            findViewById(R.id.spot51),findViewById(R.id.spot52),findViewById(R.id.spot53),findViewById(R.id.spot54),findViewById(R.id.spot55),findViewById(R.id.spot56),findViewById(R.id.spot57),findViewById(R.id.spot58),findViewById(R.id.spot59),findViewById(R.id.spot60),
            findViewById(R.id.spot61),findViewById(R.id.spot62),findViewById(R.id.spot63),findViewById(R.id.spot64),findViewById(R.id.spot65),findViewById(R.id.spot66),findViewById(R.id.spot67),findViewById(R.id.spot68),findViewById(R.id.spot69),findViewById(R.id.spot70),
            findViewById(R.id.spot71),findViewById(R.id.spot72),findViewById(R.id.spot73),findViewById(R.id.spot74),findViewById(R.id.spot75),findViewById(R.id.spot76),findViewById(R.id.spot77),findViewById(R.id.spot78),findViewById(R.id.spot79),findViewById(R.id.spot80),
            findViewById(R.id.spot81),findViewById(R.id.spot82),findViewById(R.id.spot83),findViewById(R.id.spot84),findViewById(R.id.spot85),findViewById(R.id.spot86),findViewById(R.id.spot87),findViewById(R.id.spot88),findViewById(R.id.spot89),findViewById(R.id.spot90),
            findViewById(R.id.spot91),findViewById(R.id.spot92),findViewById(R.id.spot93),findViewById(R.id.spot94),findViewById(R.id.spot95),findViewById(R.id.spot96),findViewById(R.id.spot97),findViewById(R.id.spot98),findViewById(R.id.spot99),findViewById<ImageButton>(R.id.spot100)
        )
        val One = arrayOf(
            0,1,1,1,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,1,1,1,1,1,0,0,0,0,
            0,0,0,0,0,0,0,0,1,0,
            0,0,1,0,0,0,0,0,1,0,
            0,0,1,0,0,1,0,0,1,0,
            0,0,0,0,0,1,0,0,0,0,
            0,0,0,0,0,1,0,0,0,0,
            0,0,0,0,0,1,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0)
        var i=0
        var current=1
        var spot =0
        for(i in buttons){

            val buttonID = "spot$current"
            val resID = resources.getIdentifier(buttonID, "id", packageName)
            val temp=findViewById<View>(resID) as ImageButton
            temp.setImageResource(R.drawable.water)
            temp.setTag(One[spot].toString())
            temp.setOnClickListener(myNewButtonListener)
            current++
            spot++
        }


        val btnReset = findViewById<Button>(R.id.btnReset)
        btnReset.setOnClickListener {
            var i=0
            var current=1
            var spot =0
            for(i in buttons){

                val buttonID = "spot$current"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                val temp=findViewById<View>(resID) as ImageButton
                temp.setImageResource(R.drawable.water)
                temp.setTag(0)
                temp.setTag(One[spot].toString())
                current++
                spot++
            }
            //Toast.makeText(applicationContext, ""+test.tag, Toast.LENGTH_LONG).show()

        }

    }
    var myNewButtonListener =  View.OnClickListener() {
        //Toast.makeText(applicationContext, ""+it.tag, Toast.LENGTH_LONG).show()
        val buttonImage = it as ImageButton
        it.isEnabled=false
        //not working
        if (it.tag=="1"){
            it.setImageResource(R.drawable.fire)
            hit++
            total++

        }
        else{
            it.setImageResource(R.drawable.miss)
            total++
        }

        txtHit.text=hit.toString()
        txtTaken.text=total.toString()
        acc=(hit / total) * 100

        txtAcc.text=("%.2f".format(acc)+"%").toString()



    }


}