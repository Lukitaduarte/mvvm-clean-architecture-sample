package br.com.duarti.di

import br.com.duarti.data.RepositoriesRepository
import br.com.duarti.data.RepositoriesRepositoryImpl
import br.com.duarti.presentation.repository.RepositoryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoriesModule = module {

    single<RepositoriesRepository> { RepositoriesRepositoryImpl(get()) }

    viewModel { RepositoryViewModel(get()) }

}