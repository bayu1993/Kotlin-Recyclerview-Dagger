package io.github.bayu1993.kotlinrecyclerviewwithdagger.data.repo

import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.ApiService
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

class ClubRepoImpl @Inject constructor(private val apiService: ApiService): ClubRepo {
    override fun getClubs(): Flowable<List<Club>> {
        return apiService.getClubs()
                .flatMap { Flowable.fromIterable(it.clubs) }
                .map { it.transform() }
                .toList()
                .toFlowable()
    }

}