package com.example.data.remote

import com.example.core.NetworkState
import com.example.network.dto.DtoProduct
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getALlProduct():Response<NetworkState<DtoProduct>>
}