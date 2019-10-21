package br.com.duarti.features.repositories.data

import br.com.duarti.data.model.GenericListResponse
import br.com.duarti.features.repositories.data.remote.model.RepositoriesResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{username}")
    fun getUser(@Path("username") username: String = "")

    @GET("users/{username}/repos")
    fun getUserRepos(@Path("username") username: String = ""): Single<List<RepositoriesResponse>>

}