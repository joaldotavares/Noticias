package br.com.joaldo.news.activity.news

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.joaldo.news.repository.network.API_KEY
import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.repository.network.response.NewsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NewsViewModel : ViewModel() {

    private val _newsViewModel = MutableLiveData<NewsApi>()
    val newsViewModel: LiveData<NewsApi> get() = _newsViewModel

    fun findNews() {
        viewModelScope.launch {
            try {
                val news = withContext(Dispatchers.IO) {
                    Repository.getApi().getHeadlines("br", API_KEY)
                }
                withContext(Dispatchers.Main) {
                    _newsViewModel.value = news
                }
            } catch (e: Exception) {
                Log.e("Erro News", e.message.toString())
            }
        }
    }

//    class NewsViewModelFactory(
//        private val repository: NewsDataSource
//    ): ViewModelProvider.Factory{
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            if(modelClass.isAssignableFrom(NewsViewModel::class.java)){
//                return NewsViewModel(repository) as T
//            }else{
//                throw IllegalArgumentException("Unknown ViewModel class")
//            }
//        }
//
//    }
}