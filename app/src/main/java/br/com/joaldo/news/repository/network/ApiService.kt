package br.com.joaldo.news.repository.network

import br.com.joaldo.news.repository.network.response.NewsApi
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(@Query("country") country: String, @Query("apiKey") apiKey: String): NewsApi

    @GET("v2/everything")
    suspend fun getEverything(@Query("domains") domains: String, @Query("apiKey") apiKey: String): NewsApi
}