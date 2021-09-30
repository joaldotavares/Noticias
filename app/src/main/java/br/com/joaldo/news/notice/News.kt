package br.com.joaldo.news.notice

import java.io.Serializable

data class News(
    val id: Long,
    val title: String,
    val description: String,
    val image: String,
    val text: String,
    var position: Int = -1
): Serializable