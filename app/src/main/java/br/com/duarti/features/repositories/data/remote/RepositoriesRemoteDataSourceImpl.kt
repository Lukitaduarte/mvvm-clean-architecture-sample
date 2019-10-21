package br.com.duarti.features.repositories.data.remote

import br.com.duarti.domain.mapper.Mapper
import br.com.duarti.features.repositories.data.GithubService
import br.com.duarti.features.repositories.data.RepositoriesRemoteDataSource
import br.com.duarti.features.repositories.data.remote.model.RepositoriesResponse
import br.com.duarti.features.repositories.domain.model.Repositories
import io.reactivex.Single

class RepositoriesRemoteDataSourceImpl(
   private val githubService: GithubService,
   private val remoteToDomainMapper: Mapper<RepositoriesResponse, Repositories>
) : RepositoriesRemoteDataSource {

    override fun getUserRepos(): Single<List<Repositories>> {
        return githubService.getUserRepos("lukitaduarte")
            .map {
                it.map { item ->
                    remoteToDomainMapper.map(item)
                }
            }
    }

}