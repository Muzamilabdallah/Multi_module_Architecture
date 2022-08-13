package com.example.data.remote.di


import com.example.data.remote.datasource.ProductDataSourceImp
import com.example.domain.repository.ProductRepository
import com.example.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositroyModule {
    @Singleton
    @Provides
    fun provideProductRepository(apiService: ApiService): ProductRepository {
        return ProductDataSourceImp(apiService)
    }
}