package br.com.joaldo.news.activity.news

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.joaldo.news.R
import br.com.joaldo.news.databinding.ActivityNewsBinding
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.NewsDataSource
import br.com.joaldo.news.repository.NewsDataSourceImpl
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class NewsFragment : Fragment() {

    private val newsViewModel: NewsViewModel by viewModel()
    private lateinit var binding: ActivityNewsBinding
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
        binding = ActivityNewsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        newsViewModel.newsViewModel.observe(viewLifecycleOwner, androidx.lifecycle.Observer{
            l = it
            configAdapter(it)
        })
        newsViewModel.findNews()
    }

    private fun configAdapter(
        it: List<News>
    ) {
        adapter = NewsAdapter(it)
        binding.activityNewsRecyclerview.adapter = adapter
        binding.activityNewsRecyclerview.layoutManager =
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