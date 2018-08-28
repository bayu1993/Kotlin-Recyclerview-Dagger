package io.github.bayu1993.kotlinrecyclerviewwithdagger.data

import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.model.Response
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

interface ApiService{
    @GET("opendatajson/football.json/master/2017-18/es.1.clubs.json")
    fun getClubs(): Flowable<Response>
}