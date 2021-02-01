package com.example.slisetwo.model.entity

import androidx.room.Entity

@Entity(tableName = "movie_actor", primaryKeys = ["actorId", "movieId"])
data class MovieActorCrossRefEntity(val movieId: String, val actorId: String)