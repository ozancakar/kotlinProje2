package com.example.finaluygulamasii

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_iki.*
import kotlinx.coroutines.NonDisposableHandle.parent


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class iki : Fragment() {
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

            var mesaj = view?.findViewById<EditText>(R.id.mesaj)
            var action = view?.findViewById<EditText>(R.id.action)
            var spinner = view?.findViewById<Spinner>(R.id.spinner)

            var secenekler = arrayOf("Süre Seçiniz", "2sn", "2.5sn", "3sn", "3.5sn", "4sn")
            var adapter = context?.let {
                ArrayAdapter(
                    it,
                    android.R.layout.simple_dropdown_item_1line,
                    secenekler
                )
            }

            spinner?.adapter = adapter
            spinner?.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    if (position != 0) {

                        Snackbar.make(view!!, mesaj!!.text, Snackbar.LENGTH_LONG)
                            .setAction(action!!.text) {
                                Toast.makeText(activity, action!!.text, Toast.LENGTH_LONG).show()
                            }
                            .setDuration(((1.5 + position * 0.5) * 1000).toInt())
                            .show()
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }, 100)
        return inflater.inflate(R.layout.fragment_iki, container, false)
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            iki().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}