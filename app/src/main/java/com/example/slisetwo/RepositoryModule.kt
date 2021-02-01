package com.example.slisetwo

import com.example.slisetwo.list.MovieListRepository
import com.example.slisetwo.list.MovieListRepositoryImpl
import com.example.slisetwo.selected.SelectedMovieRepository
import com.example.slisetwo.selected.SelectedMovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
interface RepositoryModule {
    @Binds
    @Singleton
    fun selectedMovieRepository(impl: SelectedMovieRepositoryImpl): SelectedMovieRepository

    @Binds
    @Singleton
    fun movieListRepository(impl: MovieListRepositoryImpl): MovieListRepository
}