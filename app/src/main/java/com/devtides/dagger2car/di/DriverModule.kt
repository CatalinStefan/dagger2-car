package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(val name: String) {
        @Singleton
        @Provides
        fun driver(): Driver = Driver(name)
}