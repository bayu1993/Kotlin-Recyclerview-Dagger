package io.github.bayu1993.kotlinrecyclerviewwithdagger.data.model

import com.google.gson.annotations.SerializedName
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
data class ClubModel(
        @field:SerializedName("name")
        private val name: String? = "",
        @field:SerializedName("key")
        private val key: String? = "",
        @field:SerializedName("code")
        private val code: String? = "") {
    fun transform(): Club = Club(
            name = this.name,
            code = this.code,
            key = this.key
    )
}