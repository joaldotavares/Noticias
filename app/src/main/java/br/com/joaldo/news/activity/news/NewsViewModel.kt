package br.com.joaldo.news.activity.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.joaldo.news.repository.network.API_KEY
import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.repository.network.response.NewsApi
import br.com.joaldo.news.util.Resources
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NewsViewModel : ViewModel() {
    private val _newsViewModel = MutableLiveData<Resources<NewsApi>>()
    val newsViewModel: LiveData<Resources<NewsApi>> get() = _newsViewModel

    fun findNews(){
        viewModelScope.launch {
            _newsViewModel.value = Resources.loading(null)
            try {
                val news = withContext(Dispatchers.IO){
                    Repository.getApi().getEverything("globo.com", API_KEY)
                }

                withContext(Dispatchers.Main){
                    news.articles[0].urlToImage = "www.google.com"
                    _newsViewModel.value = Resources.success(news)
                }
            }catch (e: Exception){
                _newsViewModel.value = Resources.erro(null, e.message.toString())
            }
        }
    }
}