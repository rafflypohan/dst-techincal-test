package com.rafflypohan.mypokemonapp.core.data.source.remote.responses

import com.google.gson.annotations.SerializedName

data class PokemonResponse(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("pagination")
	val pagination: Pagination? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null
)

data class Pagination(

	@field:SerializedName("per_page")
	val perPage: Int? = null,

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("total_pages")
	val totalPages: Int? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null
)

data class TypesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)

data class DataItem(

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
)

data class Links(

	@field:SerializedName("next_page")
	val nextPage: Any? = null,

	@field:SerializedName("first_page")
	val firstPage: String? = null,

	@field:SerializedName("last_page")
	val lastPage: String? = null,

	@field:SerializedName("prev_page")
	val prevPage: Any? = null
)
