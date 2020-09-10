package com.devtides.dagger2car.model

import com.devtides.dagger2car.model.Rims
import com.devtides.dagger2car.model.Tires
import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {
}