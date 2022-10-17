package com.example.xplora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.xplora.KeepSession.Companion.prefs
import com.example.xplora.databinding.NavHeaderHomeBinding
import com.example.xplora.domain.ApiClient
import com.example.xplora.domain.model.user
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserGetActivity : AppCompatActivity() {

    lateinit var binding: NavHeaderHomeBinding
    lateinit var apiClient: ApiClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        apiClient = ApiClient()
        binding= NavHeaderHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getUser(prefs.fetchUserId())
    }

    fun getUser(id:Int){
        apiClient.getApiService(this).getUserId(id).enqueue(object : Callback<user> {
            override fun onResponse(call: Call<user>, response: Response<user>) {
                val user=response.body()
                if (user != null) {
                    binding.fullNameUser.text=user.firstName.toString()
                    binding.emailUser.text=user.email.toString()
                }

            }

            override fun onFailure(call: Call<user>, t: Throwable) {
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
            }
        })
    }
}