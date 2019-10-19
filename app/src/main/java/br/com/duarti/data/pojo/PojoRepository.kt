package br.com.duarti.data.pojo

import com.google.gson.annotations.SerializedName

data class PojoRepository(
    private val name: String = "",
    @SerializedName("full_name") private val fullName: String = "",
    private val description: String = "",
    private val url: String = "",
    @SerializedName("created_at") private val createdAt: String = ""
)