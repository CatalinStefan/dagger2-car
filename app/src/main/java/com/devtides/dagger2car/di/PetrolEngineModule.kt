package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.Engine
import com.devtides.dagger2car.model.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine

}