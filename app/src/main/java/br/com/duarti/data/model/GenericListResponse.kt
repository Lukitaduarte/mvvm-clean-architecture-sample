package br.com.duarti.data.model

class GenericListResponse<T>(
    val items: List<T>? = listOf()
)