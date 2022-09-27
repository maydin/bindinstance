package com.murat.logger

import android.content.Context
import android.util.Log

class Logger(private val context: Context) {
    fun printPackageName() {
        Log.d("Logger", context.packageName)
    }
}