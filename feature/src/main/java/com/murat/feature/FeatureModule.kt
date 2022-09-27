package com.murat.feature

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesPrinter() = Printer(context)
}