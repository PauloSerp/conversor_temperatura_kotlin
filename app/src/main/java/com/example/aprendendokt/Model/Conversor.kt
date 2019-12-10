package com.example.aprendendokt.Model

class Conversor() {

    fun converterCelFahr(temp: Double):Double{
        return temp * 9/5 + 32
    }

    fun converterFahrCel(temp: Double):Double{
        return (temp - 32) * 5/9
    }
}