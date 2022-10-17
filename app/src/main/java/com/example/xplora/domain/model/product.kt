package com.example.xplora.domain.model

import com.google.gson.annotations.SerializedName

data class product(
    @SerializedName("id")
    var id:Int,

    @SerializedName("pCosto")
    var pCosto:String,

    @SerializedName("name")
    var name:String,

    @SerializedName("pRvtaMayor")
    var pRvtaMayor:String,

    @SerializedName("stock")
    var stock:String,

    @SerializedName("pdv")
    var pdv:pdv

) {
}