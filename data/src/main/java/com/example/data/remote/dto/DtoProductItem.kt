package com.example.data.remote.dto


import com.example.domain.model.Product
import com.google.gson.annotations.SerializedName

data class DtoProductItem(
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("title")
    val title: String
)


fun DtoProductItem.mapToProduct() = Product(
    category = category,
    description = description,
    price = price,
    title = title,
    image = image,
    id = id

)