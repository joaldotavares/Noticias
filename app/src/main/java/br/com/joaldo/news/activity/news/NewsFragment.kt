package br.com.joaldo.news.activity.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.NewsDataSourceImpl

class NewsFragment : Fragment() {

    private lateinit var viewModel: NewsViewModel
    private lateinit var factory: NewsViewModel.NewsViewModelProvider
    lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listNews = view.findViewById<RecyclerView>(R.id.activity_news_recyclerview)

        factory = NewsViewModel.NewsViewModelProvider(NewsDataSourceImpl(NewsDao()))
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        viewModel.newsViewModel.observe(viewLifecycleOwner, Observer {
            configAdapter(it, listNews)
        })
        viewModel.findNews()
    }

    private fun configAdapter(
        it: List<News>,
        listNews: RecyclerView
    ) {
        adapter = NewsAdapter(it)
        listNews.adapter = adapter

        listNews.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        adapter.onItemClickListener = { it ->
            val directions = NewsFragmentDirections.actionNewsFragmentToDetailsNewsFragment(it)
            findNavController().navigate(directions)
        }
    }
}