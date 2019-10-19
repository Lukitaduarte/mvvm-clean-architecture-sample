package br.com.duarti.data

import br.com.duarti.data.model.Repository
import io.reactivex.Flowable

interface RepositoriesDataSource {

    fun getUserRepos(): Flowable<List<Repository>>

}