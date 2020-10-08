package com.angoti.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {
        val p = peso.text.toString().toDouble()
        val a = altura.text.toString().toDouble()
        val imc = p / (a*a)
        saida.text = imc.toString()
    }

    fun teste(view: View) {
        Toast.makeText(this, "teste", Toast.LENGTH_LONG).show();
    }
}