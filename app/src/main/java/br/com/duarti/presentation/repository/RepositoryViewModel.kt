package br.com.duarti.presentation.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.duarti.data.RepositoriesRepository
import br.com.duarti.data.model.Repository

class RepositoryViewModel(
    private val repository: RepositoriesRepository
) : ViewModel() {


    fun loadUserRepos(): LiveData<List<Repository>> = repository.getUserRepos()
}
