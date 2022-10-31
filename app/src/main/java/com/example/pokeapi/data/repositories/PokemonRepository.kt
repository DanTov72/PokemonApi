package com.example.pokeapi.data.repositories

import com.example.pokeapi.base.BaseRepository
import com.example.pokeapi.data.remote.apiservices.PokeApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val pokeApiService: PokeApiService): BaseRepository() {

    fun fetchPokemonName() = doRequest {
        pokeApiService.fetchPokemonName()
    }
}