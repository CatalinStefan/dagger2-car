package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.DieselEngine
import com.devtides.dagger2car.model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideEngine(): Engine = DieselEngine(horsePower)
}