package com.example.slisetwo.list

import com.example.slisetwo.R
import com.example.slisetwo.AppNavigator
import com.example.slisetwo.model.Error
import com.example.slisetwo.model.Movie
import com.example.slisetwo.selected.SelectedMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieListInteractor @Inject constructor(
    private val movieListRepository: MovieListRepository,
    private val selectedMovieRepository: SelectedMovieRepository,
    private val appNavigator: AppNavigator
) {

    fun getMovieList(): Flow<List<Movie>> = movieListRepository.getMovieList()

    fun observeErrors(): Flow<Error> = movieListRepository.observeErrors()

    fun selectMovie(movie: Movie) {
        selectedMovieRepository.select(movie)
        appNavigator.withNavController { navigate(R.id.openMovieDetails) }
    }
}