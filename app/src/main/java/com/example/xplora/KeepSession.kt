package com.example.xplora

import android.app.Application
import com.example.xplora.utils.SessionManager

class KeepSession:Application() {
    companion object{
        lateinit var prefs:SessionManager
    }
    override fun onCreate() {
        super.onCreate()
        prefs=SessionManager(applicationContext)
    }
}