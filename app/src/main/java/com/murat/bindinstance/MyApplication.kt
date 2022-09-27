package com.murat.bindinstance

import android.app.Application
import com.murat.bindinstance.di.AppComponent
import com.murat.bindinstance.di.DaggerAppComponent
import com.murat.feature.FeatureModule
import com.murat.logger.LoggerModule

class MyApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .bindContext(this)
            .build()
    }
}