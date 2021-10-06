package br.com.joaldo.news.activity.details

import android.app.ActionBar
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.joaldo.news.R
import br.com.joaldo.news.notice.News
import com.bumptech.glide.Glide

class DetailsNewsFragment: Fragment() {

    private val args by navArgs<DetailsNewsFragmentArgs>()
    private lateinit var news: News

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments.let {
            news = args.news
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = view.findViewById<ImageView>(R.id.activity_details_image)
        val title = view.findViewById<TextView>(R.id.activity_details_title)
        val description = view.findViewById<TextView>(R.id.activity_details_description)
        val text = view.findViewById<TextView>(R.id.activity_details_text)

        title.text = news.title
        description.text = news.description
        text.text = news.text

        Glide.with(this).load(news.image).into(image)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_details_news, container, false)
    }
}