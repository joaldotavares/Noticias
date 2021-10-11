package br.com.joaldo.news.activity.news

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.joaldo.news.R
import br.com.joaldo.news.databinding.ActivityNewsBinding
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.repository.network.response.NewsApi
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class NewsFragment : Fragment() {

    private val newsViewModel: NewsViewModel by viewModel()
    private lateinit var binding: ActivityNewsBinding
    private lateinit var adapter: NewsAdapter

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
            configAdapter(it)
        })
        newsViewModel.findNews()
    }

    private fun configAdapter(
        it: NewsApi
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