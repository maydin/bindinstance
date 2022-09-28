package com.murat.bindinstance.di

import android.content.Context
import com.murat.bindinstance.ui.main.MainFragment
import com.murat.feature.FeatureModule
import com.murat.logger.LoggerModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [FeatureModule::class,LoggerModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun bindContext(context: Context): Builder
    }

    fun inject(fragment: MainFragment)
}