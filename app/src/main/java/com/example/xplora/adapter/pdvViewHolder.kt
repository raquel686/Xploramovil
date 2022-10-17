package com.example.xplora.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.xplora.R
import com.example.xplora.domain.model.pdv

class pdvViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val name=view.findViewById<TextView>(R.id.txtBDId)
    val code=view.findViewById<TextView>(R.id.txtBDuserId)
    val direction=view.findViewById<TextView>(R.id.txtBDTitle)
    val image=view.findViewById<TextView>(R.id.txtBDBody)

    fun render(posModel:pdv){
        name.text=posModel.name.toString()
        code.text=posModel.code.toString()
        direction.text=posModel.direction.toString()
        image.text=posModel.image.toString()
    }
}