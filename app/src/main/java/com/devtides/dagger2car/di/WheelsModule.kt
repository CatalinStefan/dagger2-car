package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.Rims
import com.devtides.dagger2car.model.Tires
import com.devtides.dagger2car.model.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

//    @Module
//    companion object {
//        @JvmStatic
        @Provides
        fun provideRims() = Rims()

//        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflateTires()
            return tires
        }

//        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
//    }
}