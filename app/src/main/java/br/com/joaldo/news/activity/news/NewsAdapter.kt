package br.com.joaldo.news.activity.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.repository.network.response.Article
import br.com.joaldo.news.repository.network.response.NewsApi
import com.bumptech.glide.Glide

class NewsAdapter(
    private val news: NewsApi
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    var onItemClickListener: (news: Article) -> Unit = {}

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.item_news_title)
        val description: TextView = itemView.findViewById(R.id.item_news_description)
        val image: ImageView = itemView.findViewById(R.id.item_news_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = news.articles[position]
        holder.title.text = news.title
        holder.description.text = news.description
        Glide.with(holder.itemView.context).load(news.urlToImage).into(holder.image)

        holder.itemView.setOnClickListener {
            onItemClickListener(news)
        }
    }

    override fun getItemCount(): Int {
        return news.articles.size
    }
}