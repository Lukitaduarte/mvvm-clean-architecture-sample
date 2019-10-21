package br.com.duarti.features.repositories.data.remote.model

import com.google.gson.annotations.SerializedName

data class RepositoriesResponse(
    val name: String? = "",
    @SerializedName("full_name") val fullName: String? = "",
    val description: String? = "",
    val url: String? = "",
    @SerializedName("created_at") val createdAt: String? = ""
)