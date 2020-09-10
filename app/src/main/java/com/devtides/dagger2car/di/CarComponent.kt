package com.devtides.dagger2car.di

import com.devtides.dagger2car.model.Car
import com.devtides.dagger2car.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
//@Component(dependencies = [ApplicationComponent::class],
//    modules = [WheelsModule::class, PetrolEngineModule::class])

@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun horsePower(@Named("horsePower") hp: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engineCapacity") cap: Int): Builder
//
//        fun getApplicationComponent(appComponent: ApplicationComponent): Builder
//
//        fun build(): CarComponent
//    }

//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        fun horsePower(@Named("horsePower") hp: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engineCapacity") cap: Int): Builder
//
//        fun build(): CarComponent
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horsePower") hp: Int,
            @BindsInstance @Named("engineCapacity") cap: Int
        ): CarComponent
    }
}