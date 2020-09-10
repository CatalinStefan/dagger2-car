package com.devtides.dagger2car

import android.app.Application
import com.devtides.dagger2car.di.ApplicationComponent
import com.devtides.dagger2car.di.DaggerApplicationComponent
import com.devtides.dagger2car.di.DriverModule

class Dagger2CarApplication: Application() {

//    lateinit var carComponent: CarComponent
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerApplicationComponent.create()

        appComponent = DaggerApplicationComponent.factory().create(DriverModule("John"))

//        carComponent =
//            DaggerCarComponent
//                .builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build()
    }
}