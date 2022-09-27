package com.murat.logger

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LoggerModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesLogger() = Logger(context)
}