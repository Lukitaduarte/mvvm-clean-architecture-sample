package br.com.duarti.data

import androidx.lifecycle.LiveData
import br.com.duarti.data.model.Repository

interface RepositoriesRepository {

    fun getUserRepos(): LiveData<List<Repository>>

}