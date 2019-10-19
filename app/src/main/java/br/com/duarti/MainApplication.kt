package br.com.duarti

import android.app.Application
import br.com.duarti.di.applicationModule
import br.com.duarti.di.repositoriesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(applicationModule, repositoriesModule))
        }
    }
}