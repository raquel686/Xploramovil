package com.example.xplora.domain.responses

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("id")
    var id:Int,

    @SerializedName("first_name")
    var firstName:String,

    @SerializedName("last_name")
    var lastName:String,

    @SerializedName("email")
    var email:String,

    @SerializedName("token")
    var token: String,
    ) {
}