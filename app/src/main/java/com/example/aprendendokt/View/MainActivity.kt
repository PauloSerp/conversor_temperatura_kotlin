package com.example.aprendendokt.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.aprendendokt.Model.Conversor
import com.example.aprendendokt.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var radioButtonCelcius: RadioButton
    lateinit var radioButtonFahreinheit: RadioButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        inicializaComponentes()

    }

    private fun inicializaComponentes() {
        editText = valorTemperatura
        radioButtonCelcius = celciusRadio
        radioButtonFahreinheit = fahreinheitRadio

    }

    fun convertertemperatura(view: View) {
        val conversor = Conversor()

        val temp: Double = editText.text.toString().toDouble()
        if(radioButtonCelcius.isChecked){
            val temperaturaConvertidaParaCel = conversor.converterCelFahr(temp)
            Toast.makeText(applicationContext,
                "A temperatura convertida para cel é: $temperaturaConvertidaParaCel",
                Toast.LENGTH_LONG).show()
        }else{
            val temperaturaConvertidaParaFah = conversor.converterFahrCel(temp)
            Toast.makeText(applicationContext,
                "A temperatura convertida para fah é: $temperaturaConvertidaParaFah",
                Toast.LENGTH_LONG).show()

        }

    }
}
