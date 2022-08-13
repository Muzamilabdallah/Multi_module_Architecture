package com.example.data.remote.datasource
import com.example.domain.model.Product
import com.example.domain.model.mapToProduct
import com.example.domain.repository.ProductRepository
import com.example.network.ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ProductDataSourceImp @Inject constructor(private val apiService: ApiService) :
    ProductRepository {
    override suspend fun getALlProducts() = flow<com.example.core.NetworkState<List<Product>>> {
        val response = apiService.getALlProduct()
        if (response.isSuccessful) {
            response.body()?.data?.let { data ->
                val list = data.map { it.mapToProduct() }
                emit(com.example.core.NetworkState.Success(list))
            }
        } else
            emit(com.example.core.NetworkState.Error(data = null, response.message()))
    }
}