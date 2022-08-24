package com.rafflypohan.mypokemonapp.core.data.repo

import com.rafflypohan.mypokemonapp.core.data.source.remote.RemoteDataSource
import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiResponse
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDetailModel
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.domain.repository.PokemonRepository
import com.rafflypohan.mypokemonapp.core.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor (
    private val remoteDataSource: RemoteDataSource
) : PokemonRepository{
    override suspend fun getAllPokemons(limit: Int, page: Int): Flow<ApiResponse<List<PokemonDataItem>>> {
        return remoteDataSource.getAllPokemons(limit, page)
    }

    override suspend fun getDetailPokemon(id: String): Flow<PokemonDetailModel> {
        TODO("Not yet implemented")
    }

}