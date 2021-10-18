package br.com.joaldo.news.activity.news

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.joaldo.news.databinding.ActivityNewsBinding
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.repository.network.response.NewsApi
import br.com.joaldo.news.util.Status
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsFragment : Fragment() {

    private val newsViewModel: NewsViewModel by viewModel()
    lateinit var adapter: NewsAdapter
    private lateinit var binding: ActivityNewsBinding

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
        newsViewModel.newsViewModel.observe(viewLifecycleOwner, Observer {
            when(it.status){
                Status.SUCCESS -> it.data?.let { newsApi ->
                    binding.activityNewsProgressBar.visibility = View.GONE
                    binding.activityNewsRecyclerview.visibility = View.VISIBLE
                    configAdapter(newsApi)
                }
                Status.ERRO -> {
                    var builder = AlertDialog.Builder(context)
                    builder.setTitle("Error")
                    builder.setMessage("${it.message}")
                    builder.setPositiveButton("Ok"){_, _->}
                    builder.create().show()
                    binding.activityNewsProgressBar.visibility = View.GONE
                    binding.activityNewsRecyclerview.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    binding.activityNewsRecyclerview.visibility = View.GONE
                    binding.activityNewsProgressBar.visibility = View.VISIBLE
                }
            }
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
}