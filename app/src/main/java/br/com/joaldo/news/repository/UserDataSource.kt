package br.com.joaldo.news.repository

interface UserDataSource {
    suspend fun verifyLogin(username: String, password: String): Boolean
}