package com.example.pokeapi.data.remote.apiservices

import com.example.pokeapi.models.PokemonModel
import com.example.pokeapi.models.PokemonResponse
import retrofit2.http.GET

interface PokeApi {

    @GET("pokemon")
    suspend fun fetchPokemonName(): PokemonResponse<PokemonModel>
}