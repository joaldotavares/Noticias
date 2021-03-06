package br.com.joaldo.news

import android.app.Application
import br.com.joaldo.news.di.findLoginModule
import br.com.joaldo.news.di.findNewsModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class MyApplication: Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(findNewsModel, findLoginModule)
        }
    }
}