package br.com.joaldo.news.di

import br.com.joaldo.news.activity.news.NewsViewModel
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.mock.NewsDataSource
import br.com.joaldo.news.repository.mock.NewsDataSourceImpl
import br.com.joaldo.news.repository.network.Repository
import br.com.joaldo.news.usecase.GetNewsNewsFragmentUseCase
import br.com.joaldo.news.usecase.GetNewsNewsFragmentUseCaseImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val findNewsModel = module {
//
//    factory {
//        NewsDao()
//    }
//
//    factory<NewsDataSource> {
//        NewsDataSourceImpl(get())
//    }
    factory<Repository> {
        Repository
    }

    factory<GetNewsNewsFragmentUseCase> {
        GetNewsNewsFragmentUseCaseImpl()
    }

    viewModel {
        NewsViewModel(get(), get())
    }
}