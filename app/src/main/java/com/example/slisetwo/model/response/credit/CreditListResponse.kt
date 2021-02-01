package com.example.slisetwo.model.response.credit


import com.example.slisetwo.model.response.credit.CastResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreditListResponse(
    @SerialName("cast")
    val cast: List<CastResponse>,
    @SerialName("id")
    val id: Int
)