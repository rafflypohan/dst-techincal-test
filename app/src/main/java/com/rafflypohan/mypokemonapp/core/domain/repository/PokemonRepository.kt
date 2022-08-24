package com.rafflypohan.mypokemonapp.core.domain.repository

import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiResponse
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDetailModel
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.utils.Resource
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {
    suspend fun getAllPokemons(limit: Int, page: Int): Flow<ApiResponse<List<PokemonDataItem>>>
    suspend fun getDetailPokemon(id: String): Flow<PokemonDetailModel>
}