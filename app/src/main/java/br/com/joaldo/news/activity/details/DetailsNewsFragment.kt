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
import br.com.joaldo.news.databinding.ActivityDetailsNewsBinding
import br.com.joaldo.news.databinding.ActivityNewsBinding
import br.com.joaldo.news.notice.News
import com.bumptech.glide.Glide

class DetailsNewsFragment: Fragment() {

    private val args by navArgs<DetailsNewsFragmentArgs>()
    private lateinit var news: News
    private lateinit var binding: ActivityDetailsNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments.let {
            news = args.news
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.news = news
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
}