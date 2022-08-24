package com.rafflypohan.mypokemonapp.core.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonDetailModel(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null
) : Parcelable

@Parcelize
data class DetailTypesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("types")
	val types: List<DetailTypesItem?>? = null,

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
) : Parcelable

@Parcelize
data class ResistancesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
) : Parcelable

@Parcelize
data class EvolutionsItem(

	@field:SerializedName("number")
	val number: String? = null,

	@field:SerializedName("types")
	val types: List<TypesItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("avatar")
	val avatar: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
) : Parcelable
