package com.example.slisetwo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Actor(
    val id: String = "",
    val name: String = "",
    val image: String = "",
) : Parcelable