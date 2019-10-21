package br.com.duarti.domain.mapper

interface Mapper<in M, out E> {

    fun map(type: M): E

}