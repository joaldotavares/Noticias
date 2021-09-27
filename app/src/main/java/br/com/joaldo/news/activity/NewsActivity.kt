package br.com.joaldo.news.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.adapter.NewsAdapter
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao

class NewsActivity : AppCompatActivity() {
    private val dao = NewsDao()
    private val newsList: List<News> = dao.all()
    private val adapter = NewsAdapter(newsList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val listNews = findViewById<RecyclerView>(R.id.activity_news_recyclerview)

        listNews.adapter = adapter
        listNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adapter.onItemClickListener = { it ->
            val intent = Intent(this, DetailsNewsActivity::class.java).apply {
                putExtra("news", it)
            }
            startActivity(intent)
        }
    }
}