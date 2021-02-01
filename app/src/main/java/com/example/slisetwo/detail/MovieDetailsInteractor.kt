package com.example.slisetwo.detail

import com.example.slisetwo.AppNavigator
import com.example.slisetwo.model.Movie
import com.example.slisetwo.selected.SelectedMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieDetailsInteractor @Inject constructor(
    private val repository: SelectedMovieRepository,
    private val appNavigator: AppNavigator
) {

    fun getMovieDetails(): Flow<Movie> = repository.observe()

    fun popBackStack() = appNavigator.withNavController { popBackStack() }
}