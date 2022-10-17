package com.example.xplora.domain.model

import com.google.gson.annotations.SerializedName

data class pdv (
    @SerializedName("id")
    var id:Int,

    @SerializedName("name")
    var name:String,

    @SerializedName("code")
    var code:String,

    @SerializedName("direction")
    var direction:String,

    @SerializedName("latitude")
    var latitude:String,

    @SerializedName("longitude")
    var longitude:String,

    @SerializedName("image")
    var image:String
        ){

}