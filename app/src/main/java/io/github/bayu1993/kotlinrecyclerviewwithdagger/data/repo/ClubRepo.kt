package io.github.bayu1993.kotlinrecyclerviewwithdagger.data.repo

import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club
import io.reactivex.Flowable

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

interface ClubRepo {
    fun getClubs(): Flowable<List<Club>>
}