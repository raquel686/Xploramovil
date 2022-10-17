package com.example.xplora.ui.PuntoDeVenta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.xplora.R
import com.example.xplora.domain.model.pdv

class pdvActivity : AppCompatActivity() {
    lateinit var Lista:List<pdv>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdv)


    }
}