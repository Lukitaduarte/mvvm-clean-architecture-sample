package br.com.duarti.di

import br.com.duarti.data.RepositoriesDataSource
import br.com.duarti.data.RepositoriesRepository
import br.com.duarti.data.remote.RepositoriesRemoteDataSource
import org.koin.dsl.module

val applicationModule = module {

    single<RepositoriesRepository> { Repo }

}