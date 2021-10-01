package br.com.joaldo.news.activity.news

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.NewsDataSource
import br.com.joaldo.news.repository.NewsDataSourceImpl
import java.util.*

class NewsFragment : Fragment() {
    private lateinit var viewModel: NewsViewModel
    private lateinit var factory: NewsViewModel.NewsViewModelFactory
    private lateinit var adapter: NewsAdapter
    private lateinit var l: List<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
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

        factory = NewsViewModel.NewsViewModelFactory(NewsDataSourceImpl(NewsDao()))
        viewModel = ViewModelProvider(this, factory).get(NewsViewModel::class.java)
        viewModel.newsViewModel.observe(viewLifecycleOwner, androidx.lifecycle.Observer{
            l = it
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_title_asc -> Collections.sort(l, comparatorAsc())
            else -> Collections.sort(l, comparatorDesc())
        }
        adapter.notifyDataSetChanged()
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_news, menu)
    }

    private fun comparatorDesc() = kotlin.Comparator<News> { news, news2 ->
        return@Comparator news2.title.compareTo(news.title)
    }

    private fun comparatorAsc() = kotlin.Comparator<News> { news, news2 ->
        return@Comparator news.title.compareTo(news2.title)
    }
}