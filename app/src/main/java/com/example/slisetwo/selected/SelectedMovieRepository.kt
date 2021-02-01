package com.example.slisetwo.selected

import com.example.slisetwo.model.Movie
import kotlinx.coroutines.flow.Flow

interface SelectedMovieRepository {
    fun observe(): Flow<Movie>
    fun select(movie: Movie)
}