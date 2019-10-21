package br.com.duarti.features.repositories.data.remote.mapper

import br.com.duarti.domain.mapper.Mapper
import br.com.duarti.features.repositories.data.remote.model.RepositoriesResponse
import br.com.duarti.features.repositories.domain.model.Repositories

class RemoteToDomainMapper :
    Mapper<RepositoriesResponse, Repositories> {

    override fun map(type: RepositoriesResponse): Repositories {
        return Repositories(
            name = type.name,
            fullName = type.fullName,
            description = type.description,
            url = type.url,
            createdAt = type.createdAt
        )
    }

}