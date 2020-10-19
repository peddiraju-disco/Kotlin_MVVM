package com.example.kotlin_mvvm

import android.app.Application

class KotlinMVVMApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: KotlinMVVMApp
    }
}