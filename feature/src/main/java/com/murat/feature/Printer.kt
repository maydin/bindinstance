package com.murat.feature

import android.content.Context
import android.util.Log

class Printer(private val context: Context) {
    fun printPackageName(){
        Log.d("Printer" , context.packageName)
    }
}