package com.example.slisetwo.model.response.genre


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenreResponse(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String
)