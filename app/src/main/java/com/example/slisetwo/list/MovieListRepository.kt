package com.example.slisetwo.list

import com.example.slisetwo.model.Error
import com.example.slisetwo.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    fun getMovieList(): Flow<List<Movie>>
    fun observeErrors(): Flow<Error>
}