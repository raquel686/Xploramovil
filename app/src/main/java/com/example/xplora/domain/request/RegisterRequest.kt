package com.example.xplora.domain.request

import com.google.gson.annotations.SerializedName

data class RegisterRequest (
    @SerializedName("firstName")
    var firstName:String,

    @SerializedName("lastName")
    var lastName:String,

    @SerializedName("email")
    var email: String,

    @SerializedName("password")
    var password:String
        ){
}