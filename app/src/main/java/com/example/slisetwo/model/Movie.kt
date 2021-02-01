package com.example.slisetwo.model

import android.os.Parcelable
import com.example.slisetwo.model.Actor
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: String = "",
    val title: String = "",
    val duration: String = "",
    val image: String = "",
    val imageBackground: String = "",
    val genre: String = "",
    val storyline: String = "",
    val actors: List<Actor> = emptyList(),
    val review: Int,
    val reviewCount: Int,
) : Parcelable