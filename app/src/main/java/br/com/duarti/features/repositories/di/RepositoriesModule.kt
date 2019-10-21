package br.com.duarti.features.repositories.di

import br.com.duarti.domain.mapper.Mapper
import br.com.duarti.features.repositories.data.RepositoriesRemoteDataSource
import br.com.duarti.features.repositories.domain.RepositoriesRepository
import br.com.duarti.features.repositories.data.RepositoriesRepositoryImpl
import br.com.duarti.features.repositories.data.remote.RepositoriesRemoteDataSourceImpl
import br.com.duarti.features.repositories.data.remote.mapper.RemoteToDomainMapper
import br.com.duarti.features.repositories.data.remote.model.RepositoriesResponse
import br.com.duarti.features.repositories.domain.model.Repositories
import br.com.duarti.features.repositories.domain.usecase.GetUserRepositoriesUseCase
import br.com.duarti.features.repositories.presentation.RepositoriesAdapter
import br.com.duarti.features.repositories.presentation.RepositoriesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoriesModule = module {

    single<Mapper<RepositoriesResponse, Repositories>> {
        RemoteToDomainMapper()
    }

    single<RepositoriesRemoteDataSource> {
        RepositoriesRemoteDataSourceImpl(get(), get())
    }

    single<RepositoriesRepository> {
        RepositoriesRepositoryImpl(
            get()
        )
    }

    single {
        GetUserRepositoriesUseCase(get())
    }

    single {
        RepositoriesAdapter()
    }

    viewModel { RepositoriesViewModel(get()) }

}