package br.com.duarti.features.repositories.data

import br.com.duarti.features.repositories.domain.model.Repositories
import io.reactivex.Single

interface RepositoriesRemoteDataSource {

    fun getUserRepos(): Single<List<Repositories>>

}