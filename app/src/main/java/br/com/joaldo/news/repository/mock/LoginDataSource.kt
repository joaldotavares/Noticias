package br.com.joaldo.news.repository.mock

interface LoginDataSource {
    suspend fun verifyLogin(username: String, password: String): Boolean
}