package com.example.parcial

import java.time.LocalDate

data class Registro(val fecha: LocalDate, val accion:String, val monto:Long)
object cuenta {
    var monto:Long = 0
    var saldo:Long = 0
    val historial: MutableList<Registro> = mutableListOf()
    fun registrar_accion(mensaje:String){
        this.historial.add(Registro(LocalDate.now(),mensaje,this.monto))
    }
    fun agregar_saldo(){
        this.saldo += this.monto
    }
    fun retirar_saldo(){
        this.saldo -= this.monto
    }
}