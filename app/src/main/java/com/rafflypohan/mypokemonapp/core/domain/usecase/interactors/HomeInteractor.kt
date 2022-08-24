package com.rafflypohan.mypokemonapp.core.domain.usecase.interactors

import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiResponse
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.domain.repository.PokemonRepository
import com.rafflypohan.mypokemonapp.core.domain.usecase.HomeUseCase
import com.rafflypohan.mypokemonapp.core.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeInteractor @Inject constructor(private val repository: PokemonRepository) : HomeUseCase {
    override suspend fun getAllPokemons(
        limit: Int,
        page: Int
    ): Flow<Resource<List<PokemonDataItem>>> = flow {
        repository.getAllPokemons(limit, page).collect { pokemon ->
            when (pokemon) {
                is ApiResponse.Success -> emit(
                    Resource.Success(pokemon.data) )
                is ApiResponse.Error -> emit(Resource.Error(pokemon.errorMessage, null))
                is ApiResponse.Empty -> emit(Resource.Error(pokemon.errorMessage))
            }
        }
    }
}