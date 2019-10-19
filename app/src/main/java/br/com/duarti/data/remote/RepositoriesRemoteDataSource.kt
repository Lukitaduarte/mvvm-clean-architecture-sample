package br.com.duarti.data.remote

import br.com.duarti.data.RepositoriesDataSource
import br.com.duarti.data.model.Repository
import io.reactivex.Flowable
import io.reactivex.Observable

class RepositoriesRemoteDataSource : RepositoriesDataSource {

    private val repositories = mutableListOf<Repository>()

    init {
        repositories.add(Repository("text1", "text1/text1", "A simple github repository", "http://github.com/teste1", "2019-10-03"))
        repositories.add(Repository("text2", "text2/text2", "A simple github repository 2", "http://github.com/teste2", "2019-10-03"))
        repositories.add(Repository("text3", "text3/text3", "A simple github repository 3", "http://github.com/teste2", "2019-10-03"))
    }

    override fun getUserRepos(): Flowable<List<Repository>> {
        return Flowable.fromArray(repositories)
    }

}