package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Parcelize
data class Club(
        var name: String? = "",
        var key: String? = "",
        var code: String? = "") : Parcelable