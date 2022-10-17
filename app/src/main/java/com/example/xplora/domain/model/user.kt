package com.example.xplora.domain.model

import com.google.gson.annotations.SerializedName

data class user(
    @SerializedName("id")
    var id:Int,

    @SerializedName("firstName")
    var firstName:String,

    @SerializedName("lastName")
    var lastName:String,

    @SerializedName("email")
    var email:String
) {
}