package br.com.duarti.features.repositories.data

import br.com.duarti.features.repositories.domain.RepositoriesRepository
import br.com.duarti.features.repositories.domain.model.Repositories
import io.reactivex.Single

class RepositoriesRepositoryImpl(
    private val repositoryRemoteDataSource: RepositoriesRemoteDataSource
) : RepositoriesRepository {

    override fun getUserRepos(): Single<List<Repositories>> {
        return repositoryRemoteDataSource.getUserRepos()
    }

}