package com.example.slisetwo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.slisetwo.model.entity.ActorEntity
import com.example.slisetwo.model.entity.MovieActorCrossRefEntity
import com.example.slisetwo.model.entity.MovieEntity

@Database(
    entities = [MovieEntity::class, ActorEntity::class, MovieActorCrossRefEntity::class],
    version = 1
)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}