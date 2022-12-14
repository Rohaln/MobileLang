package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlin.math.roundToInt
import kotlin.random.Random


class MainActivity : AppCompatActivity() {


    var acc=0.0
    var hit=0.0
    var total=0.0
    var rowNum= 10;
    var colNum=10
    var Boats = arrayOf(5,4,3,3,2)
    var board = arrayOf(
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0,
        0,0,0,0,0,0,0,0,0,0)
    var win=0

    lateinit var txtAcc: TextView
    lateinit var txtHit: TextView
    lateinit var txtTaken: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Battleship"
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
        //calls function to get change array values
        callMe()

        var i=0
        var current=1
        var spot =0
        for(i in buttons){

            val buttonID = "spot$current"
            val resID = resources.getIdentifier(buttonID, "id", packageName)
            val temp=findViewById<View>(resID) as ImageButton
            temp.setImageResource(R.drawable.water)
            temp.setTag(board[spot].toString())
            temp.setOnClickListener(myNewButtonListener)
            current++
            spot++
        }

        fun reset(){
            var i=0
            var current=1
            var spot =0
            for(i in buttons){

                val buttonID = "spot$current"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                val temp=findViewById<View>(resID) as ImageButton
                temp.setImageResource(R.drawable.water)
                temp.setTag(0)
                temp.isEnabled= true
                temp.setTag(board[spot].toString())
                current++
                spot++
            }
        }
        val btnReset = findViewById<Button>(R.id.btnReset)
        btnReset.setOnClickListener {
            callMe()

           reset()
            //Toast.makeText(applicationContext, ""+test.tag, Toast.LENGTH_LONG).show()

        }
        val btnInfo = findViewById<Button>(R.id.btnInfo)
        btnInfo.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Instructions")
            builder.setMessage("Click on the water blocks to fire an attack." +
                    "Sink all the ships to win\n" +
            "Ship sizes: 5,4,3,3,2")
            builder.setPositiveButton(android.R.string.ok) { dialog, which ->
                //Toast.makeText(applicationContext, android.R.string.yes, Toast.LENGTH_SHORT).show()
            }
            builder.show()

        }
        val btnTest = findViewById<Button>(R.id.btnTest)
        btnTest.setOnClickListener {
            var i=0
            var current=1
            var spot =0
            for(i in buttons){

                val buttonID = "spot$current"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                val temp=findViewById<View>(resID) as ImageButton
                if(temp.tag=="1"){
                    temp.setImageResource(R.drawable.fire)
                    //Toast.makeText(applicationContext, "jfsjsjdfsdfs", Toast.LENGTH_SHORT).show()
                    hit++
                    total++
                    win++
                }
                else  {
                    temp.setImageResource(R.drawable.miss)
                    total++
                }
                current++
                spot++
            }
            txtHit.text=hit.toString()
            txtTaken.text=total.toString()
            acc=(hit / total) * 100

            txtAcc.text=("%.2f".format(acc)+"%").toString()

            if(win==17){
                //Log.d("HELLO_TAG", "win")
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Winner")
                builder.setMessage("winner winner chicken dinner")
                builder.setPositiveButton(android.R.string.ok) { dialog, which ->
                   // Toast.makeText(applicationContext, android.R.string.yes, Toast.LENGTH_SHORT).show()
                }
                builder.show()
                callMe()

                win=0
            }

           // Toast.makeText(applicationContext, "jfsjsjdfsdfs", Toast.LENGTH_SHORT).show()

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
            win++

        }
        else{
            it.setImageResource(R.drawable.miss)
            total++
        }

        txtHit.text=hit.toString()
        txtTaken.text=total.toString()
        acc=(hit / total) * 100

        txtAcc.text=("%.2f".format(acc)+"%").toString()

        if(win==17){
            //Log.d("HELLO_TAG", "win")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Winner")
            builder.setMessage("winner winner chicken dinner")
            builder.setPositiveButton(android.R.string.ok) { dialog, which ->
                //Toast.makeText(applicationContext,
                    //android.R.string.yes, Toast.LENGTH_SHORT).show()
            }
            builder.show()
            callMe()

            win=0
        }

    }


        fun callMe() {

            //reset all the array
            for(i in 0..board.size-1){
                board[i]=0
            }
            //get random ship locations
            //var i = 0
            for (i in 0..Boats.size-1) {
                var good = false

                while (good != true) {
                    good=true
                    //Log.d("HELLO_TAG", "i." +i)
                    var tet =Random.nextDouble()
                    Log.d("HELLO_TAG", "hi "+tet)
                    if ( tet < 0.5) {
                        //get horizontal
                        var boatrow=Math.floor(Random.nextDouble()* rowNum)
                        var colStart= Math.floor(Random.nextDouble()*(colNum-Boats[i]+1))
                        //var j=0
                        for(j in 0..Boats[i]-1) {
                            //check
                            if (board[(boatrow * colNum + colStart + j).toInt()] == 1){
                                good=false
                            }
                        }
                        var z=0
                        //put on
                        if(good==true){
                            for(z in 0..Boats[i]-1){
                                board[(boatrow * colNum + colStart + z).toInt()] = 1

                            }
                        }

                    }
                    else{//check this code. not making vertical ship
                        //vertical
                        var boatCol=Math.floor(Random.nextDouble()*colNum)
                        var rowStart=Math.floor(Random.nextDouble() * (rowNum - Boats[i] +1))
                        //check
                        var k=0
                        for(k in 0..Boats[i]-1){
                            if (board[(rowStart * colNum + boatCol + k*colNum).toInt()] == 1){
                                good= false
                            }
                        }
                        var c=0//place
                        if(good==true){
                            for(c in 0..Boats[i]-1){
                                board[(rowStart * colNum + boatCol + c).toInt()] = 1

                        }

                    }
                }
            }
        }

    }

}
