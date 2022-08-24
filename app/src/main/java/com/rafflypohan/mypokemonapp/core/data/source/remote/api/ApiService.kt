package com.rafflypohan.mypokemonapp.core.data.source.remote.api

import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDetailModel
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.utils.Resource
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("pokemons")
    fun getAllPokemons(
        @Query("limit") limit: Int,
        @Query("page") page: Int
    ): Call<Resource<PokemonModel>>

    @GET("pokemons/{uuid}")
    fun getDetailPokemon(@Path("uuid") uuid: String): Call<PokemonDetailModel>
}