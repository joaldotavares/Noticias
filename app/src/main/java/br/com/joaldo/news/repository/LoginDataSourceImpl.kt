package br.com.joaldo.news.repository

class LoginDataSourceImpl : LoginDataSource{
    override suspend fun verifyLogin(username: String, password: String): Boolean{
        return (username == "admin" && password == "1234")
    }
}