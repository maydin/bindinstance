package com.murat.feature

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FeatureModule {
    @Provides
    @Singleton
    fun providesPrinter(context: Context) = Printer(context)
}