package com.devtides.dagger2car.model

import android.util.Log
import com.devtides.dagger2car.di.PerActivity
import javax.inject.Inject

const val TAG = "DaggerCar"

@PerActivity
class Car @Inject constructor(val wheels: Wheels, val engine: Engine, val driver: Driver) {

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver ${driver.name} is driving $this")
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.enableRemote(this)
    }
}