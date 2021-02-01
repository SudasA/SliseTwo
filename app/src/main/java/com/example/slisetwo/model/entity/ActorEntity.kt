package com.example.slisetwo.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "actor")
data class ActorEntity(
    @PrimaryKey val id: String = "",
    val name: String = "",
    val image: String = "",
)