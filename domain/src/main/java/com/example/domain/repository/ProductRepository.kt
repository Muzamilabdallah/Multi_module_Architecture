package com.example.domain.repository

import com.example.domain.model.Product
import com.example.core.NetworkState

interface ProductRepository {
    suspend fun getALlProducts():kotlinx.coroutines.flow.Flow<com.example.core.NetworkState<List<Product>>>
}