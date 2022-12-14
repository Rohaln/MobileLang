package com.example.capstone

import android.content.Context
import android.hardware.Sensor
import android.hardware.Sensor.TYPE_ACCELEROMETER
import android.hardware.Sensor.TYPE_MAGNETIC_FIELD
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager.SENSOR_DELAY_GAME
import android.view.animation.Animation.RELATIVE_TO_SELF
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.toDegrees

class compass : AppCompatActivity(), SensorEventListener {
    //define variables
    lateinit var sensorManager: SensorManager
    lateinit var image: ImageView
    lateinit var accelerometer: Sensor //measures the acceleration forces
    lateinit var magnetometer: Sensor //device that mesasures the magnetic feild
    private lateinit var tvDegrees: TextView


    var currentDegree = 0.0f
    var lastKnownAccelerometer = FloatArray(3)
    var lastKnownMagnetometer = FloatArray(3)
    var ChangedAccelerometer = false
    var ChangedMagnetometer = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compass)


        image = findViewById(R.id.ivCompass) as ImageView
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(TYPE_ACCELEROMETER)
        magnetometer = sensorManager.getDefaultSensor(TYPE_MAGNETIC_FIELD)
        tvDegrees = findViewById<TextView>(R.id.tvDegrees)
    }

    override fun onResume() {
        super.onResume()
        //when phone starts to move, the sensors start listening to movement
        sensorManager.registerListener(this, accelerometer, SENSOR_DELAY_GAME)
        sensorManager.registerListener(this, magnetometer, SENSOR_DELAY_GAME)
    }

    override fun onPause() {
        super.onPause()
        //when phone stops moving the sensors are turned off
        sensorManager.unregisterListener(this, accelerometer)
        sensorManager.unregisterListener(this, magnetometer)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

    override fun onSensorChanged(event: SensorEvent) {
        //checks to see if the values in the sensors have changed
        if (event.sensor === accelerometer) {
            lowPass(event.values, lastKnownAccelerometer)
            ChangedAccelerometer = true
        } else if (event.sensor === magnetometer) {
            lowPass(event.values, lastKnownMagnetometer)
            ChangedMagnetometer = true
        }

        //Takes the last accel and mag locations and converts it into a degrees,
        //if the values changed then will rotate the image
        if (ChangedAccelerometer && ChangedMagnetometer) {
            val r = FloatArray(9)
            if (SensorManager.getRotationMatrix(r, null, lastKnownAccelerometer, lastKnownMagnetometer)) {
                val orientation = FloatArray(3)
                SensorManager.getOrientation(r, orientation)
                //converts the inputs from the sensors into degrees
                val degree = (toDegrees(orientation[0].toDouble()) + 360).toFloat() % 360


                //gets the current degrees of the image and changes it to new degrees
                //saves the new degree in the degree variable
                val rotateAnimation = RotateAnimation(
                    currentDegree,
                    -degree,
                    RELATIVE_TO_SELF, 0.5f,
                    RELATIVE_TO_SELF, 0.5f)
                rotateAnimation.duration = 500 //the duration of what picture moves in milliseconds
                rotateAnimation.fillAfter = true

                image.startAnimation(rotateAnimation)
                currentDegree = -degree

                //shows the degrees you need to turn to face now
                var getDegree=currentDegree+360
                tvDegrees.text = getDegree.toString()
            }
        }
    }

    fun lowPass(input: FloatArray, output: FloatArray) {
        val alpha = 0.05f

        for (i in input.indices) {
            //loops over the array, either magetometer or accelerometer and then stores them in an array
            output[i] = output[i] + alpha * (input[i] - output[i])
        }
    }
}