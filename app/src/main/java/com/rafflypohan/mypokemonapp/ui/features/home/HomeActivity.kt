package com.rafflypohan.mypokemonapp.ui.features.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.rafflypohan.mypokemonapp.databinding.ActivityHomeBinding
import com.rafflypohan.mypokemonapp.ui.features.home.adapter.PokemonListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() =  _binding!!

    private val pokemonListAdapter by lazy { PokemonListAdapter() }

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getAllPokemons()
        recyclerViewConfig()
    }

    private fun getAllPokemons() {
        val list = homeViewModel.listPokemon
        Log.d("List: ", list.toString())
        Log.d("List: ", list.size.toString())
        pokemonListAdapter.setListPokemon(list)
    }

    private fun recyclerViewConfig() {
        with(binding){
            val layoutManager = GridLayoutManager(applicationContext, 2)
            rvPokemon.layoutManager = layoutManager
            rvPokemon.adapter = pokemonListAdapter
        }
    }
}