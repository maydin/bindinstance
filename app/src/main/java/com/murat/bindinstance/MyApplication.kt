package com.murat.bindinstance

import android.app.Application
import com.murat.bindinstance.di.AppComponent
import com.murat.bindinstance.di.DaggerAppComponent

class MyApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .bindContext(this)
            .build()
    }
}