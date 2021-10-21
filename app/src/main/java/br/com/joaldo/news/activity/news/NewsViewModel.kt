package br.com.joaldo.news.activity.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.repository.network.response.NewsApi
import br.com.joaldo.news.support.Resources
import br.com.joaldo.news.usecase.GetNewsNewsFragmentUseCase
import kotlinx.coroutines.launch


class NewsViewModel(private val useCase: GetNewsNewsFragmentUseCase,
                    private val repository: Repository) : ViewModel() {

    private val _newsViewModel = MutableLiveData<Resources<NewsApi>>()
    val newsViewModel: LiveData<Resources<NewsApi>> get() = _newsViewModel


    fun findNews() {
        viewModelScope.launch {
            _newsViewModel.value = Resources.loading(null)
            _newsViewModel.value = useCase.getNews("globo.com", repository)
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