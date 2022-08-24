package com.rafflypohan.mypokemonapp.core.data.source.remote.responses

import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class Data(

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("types")
	val types: List<TypesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("resistances")
	val resistances: List<ResistancesItem?>? = null,

	@field:SerializedName("avatar")
	val avatar: String? = null,

	@field:SerializedName("evolutions")
	val evolutions: List<EvolutionsItem?>? = null,

	@field:SerializedName("classification")
	val classification: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)

data class DetailTypesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)

data class ResistancesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)

data class EvolutionsItem(

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("types")
	val types: List<DetailTypesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("avatar")
	val avatar: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)
