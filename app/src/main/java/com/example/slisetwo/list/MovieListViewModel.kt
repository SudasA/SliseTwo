package com.example.slisetwo.list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.slisetwo.model.Error
import com.example.slisetwo.model.Movie
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class MovieListViewModel @ViewModelInject constructor(
    private val interactor: MovieListInteractor
) : ViewModel() {

    val state = MutableStateFlow(emptyList<Movie>())
    val errorState = MutableSharedFlow<Error>()

    init {
        interactor.getMovieList()
            .onEach { movies -> state.value = movies }
            .launchIn(viewModelScope)
        interactor.observeErrors()
            .onEach { error -> errorState.emit(error) }
            .launchIn(viewModelScope)
    }

    fun select(movie: Movie) {
        interactor.selectMovie(movie)
    }
}