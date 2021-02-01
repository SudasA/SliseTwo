package com.example.slisetwo

import com.example.slisetwo.model.response.config.ConfigurationResponse
import com.example.slisetwo.model.response.credit.CreditListResponse
import com.example.slisetwo.model.response.genre.GenreListResponse
import com.example.slisetwo.model.response.movie.MovieListResponse
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppClient @Inject constructor() {

    private val baseUrl = "https://api.themoviedb.org/3"
    private val apiKeyParam = "api_key"
    private val API_KEY = "a0b0cb7c53f94463d7503df7db534949"

    private val httpClient = HttpClient(OkHttp) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(
                Json {
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
            accept(ContentType.Application.Json)
            acceptContentTypes = listOf(ContentType.Application.Json)
        }
    }

    suspend fun configuration(): Result<ConfigurationResponse> = runCatching {
        httpClient.get {
            url("$baseUrl/configuration")
            parameter(apiKeyParam, API_KEY)
        }
    }

    suspend fun genreList(): Result<GenreListResponse> = runCatching {
        httpClient.get {
            url("$baseUrl/genre/movie/list")
            parameter(apiKeyParam, API_KEY)
        }
    }

    suspend fun popular(): Result<MovieListResponse> = runCatching {
        httpClient.get {
            url("$baseUrl/movie/popular")
            parameter(apiKeyParam, API_KEY)
        }
    }

    suspend fun movieCredits(id: String): Result<CreditListResponse> = runCatching {
        httpClient.get {
            url("$baseUrl/movie/$id/credits")
            parameter(apiKeyParam, API_KEY)
        }
    }
}