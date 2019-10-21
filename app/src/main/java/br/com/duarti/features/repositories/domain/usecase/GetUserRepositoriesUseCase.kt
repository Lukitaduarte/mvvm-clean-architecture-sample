package br.com.duarti.features.repositories.domain.usecase

import br.com.duarti.domain.usecase.SingleUseCase
import br.com.duarti.features.repositories.domain.RepositoriesRepository
import br.com.duarti.features.repositories.domain.model.Repositories
import io.reactivex.Single

class GetUserRepositoriesUseCase(
    private val repositoriesRepository: RepositoriesRepository
) : SingleUseCase<List<Repositories>, Void?>() {

    override fun buildUseCaseObservable(params: Void?): Single<List<Repositories>> {
        return repositoriesRepository.getUserRepos()
    }


}