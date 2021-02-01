package com.example.slisetwo.model.response.config


import com.example.slisetwo.model.response.config.ConfigurationImagesResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConfigurationResponse(
    @SerialName("images")
    val images: ConfigurationImagesResponse
)