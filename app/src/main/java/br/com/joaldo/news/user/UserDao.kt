package br.com.joaldo.news.user

import br.com.joaldo.news.notice.News

class UserDao {
    companion object {
        fun inserir(): User {
            return User("joaldo", "123456")
        }
    }
}