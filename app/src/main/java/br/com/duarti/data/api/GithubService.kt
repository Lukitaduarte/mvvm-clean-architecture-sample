package br.com.duarti.data.api

import br.com.duarti.data.pojo.PojoGenericList
import br.com.duarti.data.pojo.PojoRepository
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{username}")
    fun getUser(@Path("username") username: String = "")

    @GET("users/{username}/repos")
    fun getUserRepos(@Path("username") username: String = ""): Flowable<PojoGenericList>

}