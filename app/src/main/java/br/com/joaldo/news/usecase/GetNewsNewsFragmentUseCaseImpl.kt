package br.com.joaldo.news.usecase

import br.com.joaldo.news.repository.network.API_KEY
import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.repository.network.response.NewsApi
import br.com.joaldo.news.support.Resources
import br.com.joaldo.news.support.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetNewsNewsFragmentUseCaseImpl : GetNewsNewsFragmentUseCase {
    override suspend fun getNews(findInfo: String, repository: Repository): Resources<NewsApi> {
        return try {
            val news = withContext(Dispatchers.IO) {
                repository.getApi().getEverything(findInfo, API_KEY)
            }
            Resources(Status.SUCCESS, news, null)
        } catch (e: Exception) {
            Resources(Status.ERRO, null, e.message.toString())
        }
    }
}