package br.com.duarti.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import br.com.duarti.data.model.Repository

class RepositoriesRepositoryImpl(
    private val repositoryRemoteDataSource: RepositoriesDataSource
) : RepositoriesRepository {

    override fun getUserRepos(): LiveData<List<Repository>> {

        return LiveDataReactiveStreams.fromPublisher(repositoryRemoteDataSource.getUserRepos())

    }

}