package com.rafflypohan.mypokemonapp.core.domain.usecase

import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiResponse
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.utils.Resource
import kotlinx.coroutines.flow.Flow

interface HomeUseCase {
    suspend fun getAllPokemons(limit: Int, page: Int): Flow<Resource<List<PokemonDataItem>>>
}