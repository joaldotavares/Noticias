package br.com.joaldo.news.activity

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.joaldo.news.R
import br.com.joaldo.news.notice.News
import com.bumptech.glide.Glide

class DetailsNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_news)

        val news = intent.getSerializableExtra("news") as News

        val image = findViewById<ImageView>(R.id.activity_details_image)
        val title = findViewById<TextView>(R.id.activity_details_title)
        val description = findViewById<TextView>(R.id.activity_details_description)
        val text = findViewById<TextView>(R.id.activity_details_text)

        title.text = news.title
        description.text = news.description
        text.text = news.text

        Glide.with(this).load(news.image).into(image)
    }
}