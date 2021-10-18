package br.com.joaldo.news.di

import br.com.joaldo.news.activity.news.NewsViewModel
import br.com.joaldo.news.notice.NewsDao
import br.com.joaldo.news.repository.mock.NewsDataSource
import br.com.joaldo.news.repository.mock.NewsDataSourceImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val findNewsModel = module {

    factory {
        NewsDao()
    }

    factory<NewsDataSource> {
        NewsDataSourceImpl(get())
    }

    viewModel {
        NewsViewModel()
    }
}