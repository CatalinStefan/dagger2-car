package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface ApplicationComponent {
//    fun getDriver(): Driver

//    fun getCarComponent(dieselEngineModule: DieselEngineModule): CarComponent

//    fun getCarComponentBuilder(): CarComponent.Builder

    fun getCarComponentFactory(): CarComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): ApplicationComponent
    }
}