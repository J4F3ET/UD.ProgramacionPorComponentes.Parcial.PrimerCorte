package com.example.parcial

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class view_historial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_historial)
        val btnGuardar: Button = findViewById(R.id.irHome)
        val textView: TextView = findViewById(R.id.registros)
        val mp = MediaPlayer.create(this,R.raw.retirar_monedas)
        cuenta.historial.forEach{element ->
            textView.text = textView.text.toString() + "\n" + element.fecha +" "+ element.accion +  " "+element.monto
        }
        btnGuardar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            mp.start()
        }
    }
}