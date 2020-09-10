package com.devtides.dagger2car.model

import android.util.Log
import com.devtides.dagger2car.model.Engine
import com.devtides.dagger2car.model.TAG
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") val horsePower: Int,
    @Named("engineCapacity") val engineCapacity: Int): Engine {

    override fun start() {
        Log.d(TAG, "Petrol engine started: $horsePower hp, $engineCapacity capacity")
    }

}