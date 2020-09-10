package com.devtides.dagger2car.model

import android.util.Log

class DieselEngine(val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started: $horsePower hp")
    }
}