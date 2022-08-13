package com.example.presntation.ui.theme.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.NetworkState
import com.example.domain.model.Product
import com.example.domain.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ProductViewModel @Inject constructor(val productRepository: ProductRepository) : ViewModel() {

    init {

        getProduct()
    }

    private val _state = MutableStateFlow<UiState>(UiState.Loading)
    val state = _state.asStateFlow()

    fun getProduct() {
        viewModelScope.launch {
            productRepository.getALlProducts().collectLatest {
                when (it) {

                    is com.example.core.NetworkState.Success -> {

                        _state.value = UiState.Success(it.data)
                    }

                    is com.example.core.NetworkState.Error -> {
                        _state.value = UiState.Error(it.message.toString())

                    }

                }
            }
        }


    }
}


sealed class UiState {
    data class Success(val product: List<Product>?) : UiState()
    class Error(error: String) : UiState()
    object Loading : UiState()
}