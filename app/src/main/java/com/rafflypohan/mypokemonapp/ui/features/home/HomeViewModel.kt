package com.rafflypohan.mypokemonapp.ui.features.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.core.domain.usecase.HomeUseCase
import com.rafflypohan.mypokemonapp.core.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val useCase: HomeUseCase) : ViewModel() {
    private val _listPokemon = mutableListOf<PokemonDataItem>()
    val listPokemon = _listPokemon

    private fun getAllPokemons(limit: Int, page: Int) = viewModelScope.launch {
        useCase.getAllPokemons(limit, page).collect { pokemon ->
            when(pokemon){
                is Resource.Success -> pokemon.data?.let { listPokemon.addAll(it) }
                is Resource.Error -> Log.d("View Model ", "error")
                else -> {}
            }
        }
    }

    init {
        getAllPokemons(10, 1)
    }
}