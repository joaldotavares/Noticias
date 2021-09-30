package br.com.joaldo.news.activity.news

import android.util.Log
import androidx.lifecycle.*
import br.com.joaldo.news.notice.News
import br.com.joaldo.news.repository.NewsDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class NewsViewModel(
    private val repository: NewsDataSource
): ViewModel() {
    private val _newsViewModel = MutableLiveData<List<News>>()
    val newsViewModel: LiveData<List<News>> get() = _newsViewModel

    fun findNews(){
        viewModelScope.launch {
            try {
                val news = withContext(Dispatchers.Default){
                    repository.getNews()
                }
                _newsViewModel.value = news
            }catch (e: Exception){
                Log.e("Erro", e.message.toString())
            }
        }
    }

    class NewsViewModelFactory(
        val repository: NewsDataSource
    ): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(NewsViewModel::class.java)){
                return NewsViewModel(repository) as T
            }else{
                throw IllegalArgumentException("Unknown ViewModel class")
            }
        }

    }
}