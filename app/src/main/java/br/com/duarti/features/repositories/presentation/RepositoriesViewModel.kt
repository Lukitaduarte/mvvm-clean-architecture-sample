package br.com.duarti.features.repositories.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.duarti.features.repositories.domain.model.Repositories
import br.com.duarti.features.repositories.domain.usecase.GetUserRepositoriesUseCase

class RepositoriesViewModel(
    private val getUserRepositories: GetUserRepositoriesUseCase
) : ViewModel() {

    val repositories = MutableLiveData<List<Repositories>>()

    fun loadUserRepositories() {
        getUserRepositories.execute(
            onSuccess = {
                repositories.value = it
            },
            onError = {
                it.printStackTrace()
            }
        )
    }
}
