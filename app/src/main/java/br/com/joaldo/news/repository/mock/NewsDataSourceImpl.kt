package br.com.joaldo.news.repository.mock

import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao

class NewsDataSourceImpl(
    private val dao: NewsDao
): NewsDataSource {
    override suspend fun getNews(): List<News> {
        return dao.all()
    }
}