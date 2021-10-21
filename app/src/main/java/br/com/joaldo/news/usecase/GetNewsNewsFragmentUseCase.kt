package br.com.joaldo.news.usecase

import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.repository.network.response.NewsApi
import br.com.joaldo.news.support.Resources

interface GetNewsNewsFragmentUseCase {

    suspend fun getNews(findInfo: String, repository: Repository): Resources<NewsApi>
}