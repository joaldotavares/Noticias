package br.com.joaldo.news.di

import br.com.joaldo.news.activity.login.LoginViewModel
import br.com.joaldo.news.repository.mock.LoginDataSource
import br.com.joaldo.news.repository.mock.LoginDataSourceImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val findLoginModule = module {

    factory<LoginDataSource>{
        LoginDataSourceImpl()
    }

    viewModel {
        LoginViewModel(get())
    }
}

