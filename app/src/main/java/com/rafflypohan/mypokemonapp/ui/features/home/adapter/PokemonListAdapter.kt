package com.rafflypohan.mypokemonapp.ui.features.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonDataItem
import com.rafflypohan.mypokemonapp.core.domain.model.PokemonModel
import com.rafflypohan.mypokemonapp.databinding.PokemonListItemBinding

class PokemonListAdapter: RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder>() {

    private val listPokemon = ArrayList<PokemonDataItem>()

    var onItemClick: ((PokemonDataItem) -> Unit)? = null

    fun setListPokemon(pokemon: List<PokemonDataItem>){
        listPokemon.clear()
        listPokemon.addAll(pokemon)
        notifyDataSetChanged()
    }

    inner class PokemonListViewHolder(private val binding: PokemonListItemBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener{
                onItemClick?.invoke(listPokemon[bindingAdapterPosition])
            }
        }
        fun bind(pokemon: PokemonDataItem){
            with(binding){
                Glide.with(itemView.context)
                    .load(pokemon.avatar)
                    .into(ivPokemon)

                tvPokemonName.text = pokemon.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder {
        val pokemonListItemBinding = PokemonListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonListViewHolder(pokemonListItemBinding)
    }

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        holder.bind(listPokemon[position])
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }
}