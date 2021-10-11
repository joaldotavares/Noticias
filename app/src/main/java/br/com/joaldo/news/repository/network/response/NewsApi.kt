package br.com.joaldo.news.repository.network.response

import java.io.Serializable

class NewsApi(
    var status: String = "",
    var totalResults: Int = 0,
    var articles: List<Article> = mutableListOf()
): Serializable
