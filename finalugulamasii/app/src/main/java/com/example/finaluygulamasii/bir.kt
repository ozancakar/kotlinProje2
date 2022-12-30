package com.example.finaluygulamasii

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [bir.newInstance] factory method to
 * create an instance of this fragment.
 */
class bir : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({

            var redSeek = view?.findViewById<SeekBar>(R.id.seekBar2)
            var greenSeek = view?.findViewById<SeekBar>(R.id.seekBar3)
            var blueSeek = view?.findViewById<SeekBar>(R.id.seekBar4)





            redSeek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    var redSeek = view?.findViewById<SeekBar>(R.id.seekBar2)
                    var greenSeek = view?.findViewById<SeekBar>(R.id.seekBar3)
                    var blueSeek = view?.findViewById<SeekBar>(R.id.seekBar4)
                    println(redSeek?.progress)
                    println(greenSeek?.progress)
                    println(blueSeek?.progress)
                    var rValue = Integer.toHexString(redSeek?.progress!!)
                    var gValue = Integer.toHexString(greenSeek?.progress!!)
                    var bValue = Integer.toHexString(blueSeek?.progress!!)

                    var arr = arrayOf<String>(
                        "0",
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "9",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f"
                    )

                    if (arr.contains(rValue)) {
                        rValue = "0$rValue"
                    }
                    if (arr.contains(gValue)) {
                        gValue = "0$gValue"
                    }
                    if (arr.contains(bValue)) {
                        bValue = "0$bValue"
                    }


                    var screen = view?.findViewById<ConstraintLayout>(R.id.screen)
                    screen?.setBackgroundColor(Color.parseColor("#${rValue}${gValue}${bValue}"))

                    var ColorText = view?.findViewById<TextView>(R.id.textcolor)

                    ColorText!!.setText("#${rValue}${gValue}${bValue}")


                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            })


            greenSeek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    var redSeek = view?.findViewById<SeekBar>(R.id.seekBar2)
                    var greenSeek = view?.findViewById<SeekBar>(R.id.seekBar3)
                    var blueSeek = view?.findViewById<SeekBar>(R.id.seekBar4)
                    println(redSeek?.progress)
                    println(greenSeek?.progress)
                    println(blueSeek?.progress)
                    var rValue = Integer.toHexString(redSeek?.progress!!)
                    var gValue = Integer.toHexString(greenSeek?.progress!!)
                    var bValue = Integer.toHexString(blueSeek?.progress!!)

                    var arr = arrayOf<String>(
                        "0",
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "9",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f"
                    )

                    if (arr.contains(rValue)) {
                        rValue = "0$rValue"
                    }
                    if (arr.contains(gValue)) {
                        gValue = "0$gValue"
                    }
                    if (arr.contains(bValue)) {
                        bValue = "0$bValue"
                    }


                    var screen = view?.findViewById<ConstraintLayout>(R.id.screen)
                    screen?.setBackgroundColor(Color.parseColor("#${rValue}${gValue}${bValue}"))

                    var ColorText = view?.findViewById<TextView>(R.id.textcolor)

                    ColorText!!.setText("#${rValue}${gValue}${bValue}")
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            })



            blueSeek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    var redSeek = view?.findViewById<SeekBar>(R.id.seekBar2)
                    var greenSeek = view?.findViewById<SeekBar>(R.id.seekBar3)
                    var blueSeek = view?.findViewById<SeekBar>(R.id.seekBar4)
                    println(redSeek?.progress)
                    println(greenSeek?.progress)
                    println(blueSeek?.progress)
                    var rValue = Integer.toHexString(redSeek?.progress!!)
                    var gValue = Integer.toHexString(greenSeek?.progress!!)
                    var bValue = Integer.toHexString(blueSeek?.progress!!)

                    var arr = arrayOf<String>(
                        "0",
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "9",
                        "a",
                        "b",
                        "c",
                        "d",
                        "e",
                        "f"
                    )

                    if (arr.contains(rValue)) {
                        rValue = "0$rValue"
                    }
                    if (arr.contains(gValue)) {
                        gValue = "0$gValue"
                    }
                    if (arr.contains(bValue)) {
                        bValue = "0$bValue"
                    }


                    var screen = view?.findViewById<ConstraintLayout>(R.id.screen)
                    screen?.setBackgroundColor(Color.parseColor("#${rValue}${gValue}${bValue}"))

                    var ColorText = view?.findViewById<TextView>(R.id.textcolor)

                    ColorText!!.setText("#${rValue}${gValue}${bValue}")
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                }
            })


        }, 100)
        return inflater.inflate(R.layout.fragment_bir, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment bir.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            bir().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}