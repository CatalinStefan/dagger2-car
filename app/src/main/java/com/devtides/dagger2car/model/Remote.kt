package com.devtides.dagger2car.model

import android.util.Log
import com.devtides.dagger2car.model.Car
import com.devtides.dagger2car.model.TAG
import javax.inject.Inject

class Remote @Inject constructor() {

    fun enableRemote(car: Car) {
        Log.d(TAG, "Remote is connected")
    }

}