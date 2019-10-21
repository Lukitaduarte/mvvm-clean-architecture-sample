package br.com.duarti.di

import br.com.duarti.di.Network.API_URL
import br.com.duarti.features.repositories.data.GithubService
import br.com.duarti.features.repositories.presentation.RepositoriesFragment
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Network {
    const val API_URL = "https://api.github.com/"
}

val applicationModule = module {

    single<RxJava2CallAdapterFactory> {  RxJava2CallAdapterFactory.create() }

    single<GsonConverterFactory> { GsonConverterFactory.create(get()) }

    single<Gson> { GsonBuilder().create() }

    single<Retrofit> {
        Retrofit.Builder()
            .addCallAdapterFactory(get<RxJava2CallAdapterFactory>())
            .addConverterFactory(get<GsonConverterFactory>())
            .baseUrl(API_URL)
            .build()
    }

    single<GithubService> {
        get<Retrofit>().create(GithubService::class.java)
    }

    single {
        RepositoriesFragment.newInstance()
    }

}