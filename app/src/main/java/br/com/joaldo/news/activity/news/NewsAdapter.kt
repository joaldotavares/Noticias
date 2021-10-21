package br.com.joaldo.news.activity.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.databinding.ItemNewsBinding
import br.com.joaldo.news.repository.network.response.Article
import br.com.joaldo.news.repository.network.response.NewsApi
import com.bumptech.glide.Glide

class NewsAdapter(
    private val news: NewsApi
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    private lateinit var binding: ItemNewsBinding
    var onItemClickListener: (news: Article) -> Unit = {}

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.item_news_title)
        val description: TextView = itemView.findViewById(R.id.item_news_description)
        val image: ImageView = itemView.findViewById(R.id.item_news_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = news.articles[position]
        binding.news = news
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