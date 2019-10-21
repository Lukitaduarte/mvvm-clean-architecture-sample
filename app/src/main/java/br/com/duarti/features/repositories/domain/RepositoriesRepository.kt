package br.com.duarti.features.repositories.domain

import br.com.duarti.features.repositories.domain.model.Repositories
import io.reactivex.Single

interface RepositoriesRepository {

    fun getUserRepos(): Single<List<Repositories>>

}