package com.example.finaluygulamasii


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_ikinci_sayfa.*
import kotlinx.android.synthetic.main.activity_main.*

class Ikinci_Sayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_sayfa)
        val dosyayolu = "com.example.finaluygulamasii"
        var preferences = getSharedPreferences(dosyayolu, Context.MODE_PRIVATE)
        progressBar2.visibility = View.INVISIBLE

        editTextTextPersonName.setText(preferences.getString("anahtarisim", "Değer Yok"))
        editTextTextPersonName4.setText(preferences.getString("anahtarsifre", "Değer Yok"))
        switch1.isChecked = preferences.getBoolean("anahtarhatirla", false)

        Toast.makeText(
            this,
            "Kaydedilmiş\n" + "İsim : ${
                preferences.getString(
                    "anahtarisim",
                    "Değer Yok"
                )
            }\n" + "Şifre : ${
                preferences.getString(
                    "anahtarsifre",
                    "Değer Yok"
                )
            }\n" + "Unutma : ${preferences.getBoolean("anahtarhatirla", false)}",
            Toast.LENGTH_SHORT
        )
            .show()

        if (editTextTextPersonName.text.toString() == "Değer Yok" && editTextTextPersonName4.text.toString() == "Değer Yok") {
            editTextTextPersonName.setText("")
            editTextTextPersonName4.setText("")
        }
        var editor = preferences.edit()

        if (editTextTextPersonName.text.toString() == "Ozan Cakar"
            && editTextTextPersonName4.text.toString() == "02205076045"
        ) {
            if (switch1.isChecked) {
                editor.putString("anahtarisim", editTextTextPersonName.text.toString())
                editor.putString("anahtarsifre", editTextTextPersonName4.text.toString())
                editor.putBoolean("anahtarhatirla", switch1.isChecked)
                editor.apply()
            }
            progressBar2.isVisible = true
            Handler().postDelayed({
                var gecis1 = Intent(applicationContext, Ucuncu_Sayfa::class.java)
                startActivity(gecis1)
                finish()
            }, 3000)
        }
        editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (
                    editTextTextPersonName.text.toString() == "Ozan Cakar"
                    && editTextTextPersonName4.text.toString() == "02205076045"
                ) {
                    progressBar2.isVisible = true
                    Handler().postDelayed({
                        var gecis1 = Intent(applicationContext, Ucuncu_Sayfa::class.java)
                        startActivity(gecis1)
                        finish()
                    }, 3000)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        )
        editTextTextPersonName4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                var preferences =
                    getSharedPreferences(dosyayolu, Context.MODE_PRIVATE)
                var editor = preferences.edit()

                if (editTextTextPersonName.text.toString() == "Ozan Cakar"
                    && editTextTextPersonName4.text.toString() == "02205076045"
                ) {
                    if (switch1.isChecked) {
                        editor.putString("anahtarisim", editTextTextPersonName.text.toString())
                        editor.putString("anahtarsifre", editTextTextPersonName4.text.toString())
                        editor.putBoolean("anahtarhatirla", switch1.isChecked)
                        editor.apply()
                    }
                    progressBar2.isVisible = true
                    Handler().postDelayed({
                        var gecis1 = Intent(applicationContext, Ucuncu_Sayfa::class.java)
                        startActivity(gecis1)
                        finish()
                    }, 3000)
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        )
    }
}