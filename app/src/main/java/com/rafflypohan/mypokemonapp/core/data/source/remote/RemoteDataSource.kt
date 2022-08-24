package com.rafflypohan.mypokemonapp.core.data.source.remote

import android.util.Log
import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiResponse
import com.rafflypohan.mypokemonapp.core.data.source.remote.api.ApiService
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.awaitResponse
import java.lang.Exception
import javax.inject.Inject

class RemoteDataSource @Inject constructor (private val apiService: ApiService) {
    fun getAllPokemons(limit: Int, page: Int): Flow<ApiResponse<List<PokemonDataItem>>> = flow {
        try {
            val result = apiService.getAllPokemons(limit, page).awaitResponse()
            when {
                result.isSuccessful -> {
                    result.body()?.let {
                        Log.d("Data Source 1", it.data.toString())
                        Log.d("Data Source 2", it.message.toString())
                        it.data?.data?.map { item ->
                            emit(ApiResponse.Success(listOf(item!!)))
                            Log.d("Data Source 3", item.toString())
                        }
                    }
                }
                else -> {
                    result.body()?.let {
                        emit(ApiResponse.Empty(it.message!!))
                        Log.d("Data Source 4", it.message)
                    }
                }
            }
        } catch (e: Exception){
            emit(ApiResponse.Error(e.toString()))
            Log.d("Data Source 5", e.toString())

        }
    }.flowOn(Dispatchers.IO)

    fun getDetailPokemons(uuid: String) = flow {
        try {
            val result = apiService.getDetailPokemon(uuid).awaitResponse()
            when {
                result.isSuccessful -> {
                    result.body()?.let {
                        emit(ApiResponse.Success(it))
                    }
                }
                else -> {
                    result.body()?.let {
                        emit(ApiResponse.Empty(it.message!!))
                    }
                }
            }
        } catch (e: Exception){
            emit(ApiResponse.Error(e.toString()))
        }
    }
}

