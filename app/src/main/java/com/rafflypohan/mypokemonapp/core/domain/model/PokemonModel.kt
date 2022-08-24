package com.rafflypohan.mypokemonapp.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class PokemonModel(
	val code: Int? = null,
	val pagination: Pagination? = null,
	val data: List<PokemonDataItem?>? = null,
	val message: String? = null
) : Parcelable

@Parcelize
data class PokemonDataItem(
	val number: String? = null,
	val types: List<TypesItem?>? = null,
	val name: String? = null,
	val avatar: String? = null,
	val uuid: String? = null
) : Parcelable

@Parcelize
data class Pagination(
	val perPage: Int? = null,
	val total: Int? = null,
	val count: Int? = null,
	val links: Links? = null,
	val totalPages: Int? = null,
	val currentPage: Int? = null
) : Parcelable

@Parcelize
data class Links(
	val nextPage: String? = null,
	val firstPage: String? = null,
	val lastPage: String? = null,
	val prevPage: String? = null
) : Parcelable

@Parcelize
data class TypesItem(
	val name: String? = null,
	val uuid: String? = null
) : Parcelable
