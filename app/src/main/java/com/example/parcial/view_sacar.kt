package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class view_sacar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_sacar)
        val btnGuardar: Button = findViewById(R.id.guardar)
        val textInputEditTextview_sacar = findViewById<TextInputEditText>(R.id.input_sacar_monto)
        btnGuardar.setOnClickListener {
            val valorIngresado = textInputEditTextview_sacar.text.toString()
            if ((valorIngresado != "" || valorIngresado != null)&& valorIngresado.toLong() < cuenta.saldo){
                val intent: Intent = Intent(this, MainActivity::class.java)
                cuenta.monto = valorIngresado.toLong()
                cuenta.retirar_saldo()
                cuenta.registrar_accion("Retiro")
                startActivity(intent)
            }
        }
    }
}