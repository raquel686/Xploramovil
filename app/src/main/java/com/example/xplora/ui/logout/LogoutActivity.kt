package com.example.xplora.ui.logout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xplora.HomeActivity
import com.example.xplora.KeepSession.Companion.prefs
import com.example.xplora.MainActivity

class LogoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs.wipe()
        onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }
}