package com.example.finaluygulamasii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.visibility = View.INVISIBLE
        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1==10){
                    progressBar.visibility = View.VISIBLE
                    Handler().postDelayed({
                        var gecis1 = Intent(applicationContext,Ikinci_Sayfa::class.java)
                        startActivity(gecis1)
                        finish()
                    },3000)

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

                val sayici =object :CountDownTimer(1000,100){
                    override fun onTick(p0: Long) {
                        seekBar2.progress = seekBar2.progress -1
                    }

                    override fun onFinish() {

                    }

                }
                sayici.start()
            }

        })

    }
}