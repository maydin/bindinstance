package com.murat.logger

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LoggerModule {
    @Provides
    @Singleton
    fun providesLogger(context: Context) = Logger(context)
}