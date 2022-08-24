package com.rafflypohan.mypokemonapp.core.domain.usecase

import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDetailModel
import kotlinx.coroutines.flow.Flow

interface DetailUseCase {
    suspend fun getDetailPokemon(id: String): Flow<PokemonDetailModel>
}