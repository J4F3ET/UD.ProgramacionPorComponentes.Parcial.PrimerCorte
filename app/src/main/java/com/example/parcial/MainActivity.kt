package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAhorrar : Button = findViewById(R.id.btn_ahorrar_dinero)
        val btnSacar : Button = findViewById(R.id.btn_sacar_dinero)
        val btnHistorial: Button = findViewById(R.id.btn_ver_historial)
        val saldoText: TextView = findViewById(R.id.saldo_text)
        saldoText.text = cuenta.saldo.toString()
        btnAhorrar.setOnClickListener{
            val intent: Intent = Intent(this, view_ahorro::class.java)
            startActivity(intent)
        }
        btnSacar.setOnClickListener{
            val intent: Intent = Intent(this, view_sacar::class.java)
            startActivity(intent)
        }
        btnHistorial.setOnClickListener{
            val intent: Intent = Intent(this, view_historial::class.java)
            startActivity(intent)
        }
    }
}