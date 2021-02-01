package com.example.slisetwo.selected

import com.example.slisetwo.model.Movie
import com.example.slisetwo.selected.SelectedMovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filterNotNull
import javax.inject.Inject

class SelectedMovieRepositoryImpl @Inject constructor() : SelectedMovieRepository {

    private val selected = MutableStateFlow<Movie?>(null)

    override fun observe(): Flow<Movie> = selected.filterNotNull()

    override fun select(movie: Movie) {
        selected.value = movie
    }
}