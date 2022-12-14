package com.murat.bindinstance.di

import com.murat.bindinstance.ui.main.MainFragment
import com.murat.feature.FeatureModule
import com.murat.logger.LoggerModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FeatureModule::class,LoggerModule::class])
interface AppComponent {
    fun inject(fragment: MainFragment)
}