package com.rafflypohan.mypokemonapp.core.di

import com.rafflypohan.mypokemonapp.core.data.repo.PokemonRepositoryImpl
import com.rafflypohan.mypokemonapp.core.domain.repository.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindPokemonRepository(
        pokemonRepositoryImpl: PokemonRepositoryImpl
    ): PokemonRepository
}