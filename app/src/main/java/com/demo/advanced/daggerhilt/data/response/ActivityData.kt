package com.demo.advanced.daggerhilt.data.response

import com.google.gson.annotations.SerializedName

data class ActivityData(

	@field:SerializedName("dueDate")
	val dueDate: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("completed")
	val completed: Boolean? = null,

	@field:SerializedName("title")
	val title: String? = null
)
