package br.com.joaldo.news.repository

class UserDataSourceImpl: UserDataSource {
    override suspend fun verifyLogin(username: String, password: String): Boolean {
       return (username == "admin" && password == "1234")
    }
}