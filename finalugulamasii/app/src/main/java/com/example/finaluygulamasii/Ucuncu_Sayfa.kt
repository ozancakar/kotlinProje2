package com.example.finaluygulamasii

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.rgb
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_ikinci_sayfa.*
import kotlinx.android.synthetic.main.activity_ucuncu_sayfa.*
import kotlinx.android.synthetic.main.fragment_iki.*

class Ucuncu_Sayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ucuncu_sayfa)
        var dosyayolu = "com.example.finaluygulamasii"

        fun fragmentgecis (fragment: Fragment){
            var gecis = supportFragmentManager.beginTransaction()
            gecis.replace(R.id.fragmentContainerView,fragment)
            gecis.commit()
        }

        button.setOnClickListener {
            val acilirmenu = PopupMenu(this,button)

            acilirmenu.menuInflater.inflate(R.menu.popupmenu,acilirmenu.menu)
            acilirmenu.setOnMenuItemClickListener { i ->
                when(i.itemId) {
                    R.id.rgb -> {
                        fragmentgecis(bir())

                        true}
                    R.id.snackbaritemi -> {
                        fragmentgecis(iki())

                        true}


                    R.id.cikisitemi -> {
                        val tasarim = layoutInflater.inflate(R.layout.cikisalert,null)
                        val ad = Dialog(this)
                        var gorunmez = tasarim.findViewById<TextView>(R.id.textView2)
                        gorunmez.visibility = View.INVISIBLE
                        ad.setContentView(tasarim)
                        ad.setCancelable(true)
                        ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        ad.show()
                        var isimgir = tasarim.findViewById<EditText>(R.id.editTextTextPersonName2)
                        var sifregir = tasarim.findViewById<EditText>(R.id.editTextNumber)
                        isimgir.addTextChangedListener(object : TextWatcher {
                            override fun beforeTextChanged(
                                p0: CharSequence?,
                                p1: Int,
                                p2: Int,
                                p3: Int
                            ) {
                            }

                            override fun onTextChanged(
                                p0: CharSequence?,
                                p1: Int,
                                p2: Int,
                                p3: Int
                            ) {
                                //println("Değişirken")
                                if (isimgir.text.toString() == "Ozan Cakar" && sifregir.text.toString() == "02205076045") {



                                    var preferences = getSharedPreferences(
                                        dosyayolu,
                                        Context.MODE_PRIVATE
                                    )
                                    var editor = preferences.edit()

                                    editor.clear()
                                    editor.apply()
                                    Handler().postDelayed({
                                        var gecis =
                                            Intent(applicationContext, Ikinci_Sayfa::class.java)
                                        startActivity(gecis)
                                        finish()
                                    }, 2000)

                                }
                            }

                            override fun afterTextChanged(p0: Editable?) {
                            }
                        })

                        sifregir.addTextChangedListener(object : TextWatcher {
                            override fun beforeTextChanged(
                                p0: CharSequence?,
                                p1: Int,
                                p2: Int,
                                p3: Int
                            ) {
                            }

                            override fun onTextChanged(
                                p0: CharSequence?,
                                p1: Int,
                                p2: Int,
                                p3: Int
                            ) {
                                //println("Değişirken")
                                if (isimgir.text.toString() == "Ozan Cakar" && sifregir.text.toString() == "02205076045") {



                                    var preferences = getSharedPreferences(
                                        dosyayolu,
                                        Context.MODE_PRIVATE
                                    )
                                    var editor = preferences.edit()

                                    editor.clear()
                                    editor.apply()
                                    Handler().postDelayed({
                                        var gecis =
                                            Intent(applicationContext, Ikinci_Sayfa::class.java)
                                        startActivity(gecis)
                                        finish()
                                    }, 2000)

                                }
                            }

                            override fun afterTextChanged(p0: Editable?) {
                            }
                        })

                        ad.show()
                        true
                    }
                    else -> false
                }
            }
            acilirmenu.show()
        }
    }
}