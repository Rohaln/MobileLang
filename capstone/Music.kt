package com.example.capstone


import android.content.res.Resources
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import org.json.JSONObject
import java.nio.charset.Charset

class Music : AppCompatActivity() {
    var artistIndex = 0
    var songIndex = 0
    var songFile=""
    var length=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)
        val spSong = findViewById(R.id.spSong) as Spinner
        val spArtist = findViewById(R.id.spArtist) as Spinner

        //read raw text resource
        val input_stream = resources.openRawResource(R.raw.artist)
        val myText = input_stream.readBytes().toString(Charset.defaultCharset())

        //extract the main (top-level) JSON object from the file read above
        val myJSON_object = JSONObject(myText)

        //the main JSON object is/includes an array called painters
        //extract that array
        var myJSON_array = myJSON_object.getJSONArray("artist")

        //create a String array of artist first and last names -- used to populate spinner
        val artist_name = arrayOfNulls<String>(myJSON_array.length())
        for (i in 0 until myJSON_array.length()) {
            //get an individual element of the JSON array
            val aJSON_element = myJSON_array.getJSONObject(i)
            //get the individual properties of the JSON element
            val first_name = aJSON_element.getString("firstName")
            val last_name = aJSON_element.getString("lastName")
            //make the artist full name
            artist_name[i] = "$first_name $last_name"
        } //end loop over myJSON_array

        //associate the artist full name with the spinner
        val aaArtist = ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, artist_name)
        spArtist.adapter = aaArtist

        //when user chooses and artist
        spArtist.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {

                artistIndex = i // remember what the user chooses

                val tvUserItem = view as TextView
                Toast.makeText(applicationContext,
                    "You chose " + tvUserItem.text.toString(),
                    Toast.LENGTH_SHORT).show()




                val artistSongs = myJSON_array.getJSONObject(i).getJSONArray("songs")

                // the file has a different number of paintings for various artists
                // so use list instead of array
                val song_titles = ArrayList<String>()
                for (k in 0 until artistSongs.length()) {
                    val aSong = artistSongs.getJSONObject(k)
                    song_titles.add(aSong.getString("title"))
                }//end loop over paintings

                spSong.adapter = null
                //clears spinner of any old paintings from previous artist

                val aaSongs = ArrayAdapter(baseContext,
                    android.R.layout.simple_spinner_item, song_titles)
                spSong.adapter = aaSongs

                //when the user chose a painting of the selected artist
                spSong.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(adapterView: AdapterView<*>, view: View,
                                                i: Int, l: Long) {


                        songIndex = i  //remember what the user chooses

                        //get the selected artist's selected painting
                        songFile = myJSON_array.getJSONObject(artistIndex)
                            .getJSONArray("songs").getJSONObject(songIndex)
                            .getString("filename")
                        Toast.makeText(applicationContext, "You chose $songFile",
                            Toast.LENGTH_SHORT).show()

                        length = myJSON_array.getJSONObject(artistIndex)
                            .getJSONArray("songs").getJSONObject(songIndex)
                            .getInt("length")




                    }//end of onItemSelected of Painting spinner


                    override fun onNothingSelected(adapterView: AdapterView<*>) {}
                }// end of setOnItemSelectedListener Painting

            } //end onItemSelected Painter

            override fun onNothingSelected(adapterView: AdapterView<*>) {}
        }// end of Painter setOnItemSelectedListener
        val btnPlay = findViewById<ImageButton>(R.id.btnPlay)

        // when button is clicked start "count down" timer
        btnPlay.setOnClickListener {

            //btnPlay.isEnabled = false //disable button so only one timer gets going at a time
            val ivCover = findViewById(R.id.ivCover) as ImageView
            val iv_id = resources.getIdentifier(songFile, "drawable",
                packageName)
            ivCover.setImageResource(iv_id)


            val res: Resources = resources
            val sound: Int = res.getIdentifier(songFile, "raw", packageName)
            var mp = MediaPlayer.create(getApplicationContext(), sound);
            mp.start()


            val myTimer = object : CountDownTimer(length.toLong(), 500) {
                //repeating event -- get new random number & display corresponding image
                override fun onTick(l: Long) {



                }//end onTick

                override fun onFinish() {


                    btnPlay.isEnabled = true  //re-enable button
                }//end onFinish
            } //end CountDownTimer

            // you need to start the timer or nothing happens
            myTimer.start()

        }//end setOnClickListener

    }//end onCreate
}//end MainActivity