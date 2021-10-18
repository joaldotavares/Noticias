package br.com.joaldo.news.repository.network.response

import java.io.Serializable

class Article(
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    var urlToImage: String?,
    val publishedAt: String,
    val content: String?,
    val source: Source?
): Serializable