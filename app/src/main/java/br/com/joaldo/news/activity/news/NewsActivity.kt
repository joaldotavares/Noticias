package br.com.joaldo.news.activity.news

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.activity.details.DetailsNewsActivity
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.NewsDataSourceImpl
import java.util.*

class NewsActivity : AppCompatActivity() {
    private lateinit var newsList: List<News>
    private lateinit var adapter: NewsAdapter
    private lateinit var viewModel: NewsViewModel
    private lateinit var factory: NewsViewModel.NewsViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        factory = NewsViewModel.NewsViewModelFactory(NewsDataSourceImpl(NewsDao()))
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        viewModel.newsViewModel.observe(this, androidx.lifecycle.Observer {
            configAdapter(it)
        })
        viewModel.findNews()
    }

    private fun configAdapter(news: List<News>) {
        adapter = NewsAdapter(news)
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_news_title_asc ->
                Collections.sort(newsList, comparatorAsc())
            else -> {
                Collections.sort(newsList, comparatorDesc())
            }
        }
        adapter.notifyDataSetChanged()
        return super.onOptionsItemSelected(item)
    }

    private fun comparatorDesc() = kotlin.Comparator<News> { news, news2 ->
        return@Comparator news2.title.compareTo(news.title)
    }

    private fun comparatorAsc() = kotlin.Comparator<News> { news, news2 ->
        return@Comparator news.title.compareTo(news2.title)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sort_menu_news, menu)
        return true
    }
}