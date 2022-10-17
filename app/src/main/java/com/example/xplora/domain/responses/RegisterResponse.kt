package com.example.xplora.domain.responses

import com.google.gson.annotations.SerializedName

data class RegisterResponse (
    @SerializedName("message")
    var messsage:String,
) {
}