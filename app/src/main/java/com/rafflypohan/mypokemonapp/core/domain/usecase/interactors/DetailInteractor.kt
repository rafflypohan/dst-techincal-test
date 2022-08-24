package com.rafflypohan.mypokemonapp.core.domain.usecase.interactors

import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDetailModel
import com.rafflypohan.mypokemonapp.core.domain.repository.PokemonRepository
import com.rafflypohan.mypokemonapp.core.domain.usecase.DetailUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DetailInteractor @Inject constructor (private val repository: PokemonRepository): DetailUseCase {
    override suspend fun getDetailPokemon(id: String): Flow<PokemonDetailModel> = repository.getDetailPokemon(id)
}