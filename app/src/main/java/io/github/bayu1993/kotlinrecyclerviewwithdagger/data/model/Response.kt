package io.github.bayu1993.kotlinrecyclerviewwithdagger.data.model

import com.google.gson.annotations.SerializedName
import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.model.ClubModel

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

data class Response(
        @field:SerializedName("name")
        var error:String?="",
        @field:SerializedName("clubs")
        var clubs:List<ClubModel>? = null
)