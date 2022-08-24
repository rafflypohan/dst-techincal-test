package com.rafflypohan.mypokemonapp.ui.di

import com.rafflypohan.mypokemonapp.core.domain.usecase.DetailUseCase
import com.rafflypohan.mypokemonapp.core.domain.usecase.HomeUseCase
import com.rafflypohan.mypokemonapp.core.domain.usecase.interactors.DetailInteractor
import com.rafflypohan.mypokemonapp.core.domain.usecase.interactors.HomeInteractor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {
    @Binds
    @Singleton
    abstract fun bindHomeUseCase(
        homeInteractor: HomeInteractor
    ): HomeUseCase

    @Binds
    @Singleton
    abstract fun bindDetailUseCase(
        detailInteractor: DetailInteractor
    ): DetailUseCase
}