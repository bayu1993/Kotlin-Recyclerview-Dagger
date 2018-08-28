package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui

import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.BaseView
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club

/**
 * Created by Bayu teguh pamuji on 8/28/18.
 * email : bayuteguhpamuji@gmail.com.
 */

interface MainView : BaseView {
    fun showProgress(show: Boolean)
    fun showMessage(msg: String?)
    fun displayClub(club: List<Club>)
}