package br.com.joaldo.news.activity.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.joaldo.news.R
import br.com.joaldo.news.databinding.ActivityDetailsNewsBinding
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.repository.network.response.Article
import com.bumptech.glide.Glide

class DetailsNewsFragment: Fragment() {
    private val args by navArgs<DetailsNewsFragmentArgs>()
    private lateinit var news: Article
    private lateinit var binding: ActivityDetailsNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments.let {
            news = args.news
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityDetailsNewsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.news = news
    }
}