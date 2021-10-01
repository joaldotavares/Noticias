package br.com.joaldo.news.repository

import br.com.joaldo.news.notice.News

interface NewsDataSource {

    suspend fun getNews(): List<News>
}