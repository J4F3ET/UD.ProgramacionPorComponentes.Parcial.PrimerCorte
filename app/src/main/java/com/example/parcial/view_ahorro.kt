package com.example.parcial

import android.content.Intent
import android.icu.util.UniversalTimeScale.toLong
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class view_ahorro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_ahorro)
        val btnGuardar: Button = findViewById(R.id.btn_guardar)
        val textInputEditText = findViewById<TextInputEditText>(R.id.input_monto)
        val mp = MediaPlayer.create(this,R.raw.retirar_monedas)
        btnGuardar.setOnClickListener {
            val valorIngresado = textInputEditText.text.toString()
            if (valorIngresado != "" || valorIngresado != null){
                val intent: Intent = Intent(this, MainActivity::class.java)
                cuenta.monto = valorIngresado.toLong()
                cuenta.agregar_saldo()
                cuenta.registrar_accion("Ahorro")
                startActivity(intent)
                mp.start()
            }
        }
    }
}