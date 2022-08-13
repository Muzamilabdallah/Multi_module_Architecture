package com.example.core

sealed class NetworkState<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : NetworkState<T>(data)
    class Error<T>(data: T? = null, message: String) : NetworkState<T>(data, message)
    class Loading<T>(data: T? = null, var refreshing: Boolean = false) : NetworkState<T>(data)
}
