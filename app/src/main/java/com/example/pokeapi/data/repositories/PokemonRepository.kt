package com.example.pokeapi.data.repositories

import com.example.pokeapi.base.BaseRepository
import com.example.pokeapi.data.remote.apiservices.PokeApi
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val pokeApi: PokeApi): BaseRepository() {

    fun fetchPokemonName() = doRequest {
        pokeApi.fetchPokemonName()
    }
}