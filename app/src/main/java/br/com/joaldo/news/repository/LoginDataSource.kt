package br.com.joaldo.news.repository

interface LoginDataSource {
    suspend fun verifyLogin(username: String, password: String): Boolean
}