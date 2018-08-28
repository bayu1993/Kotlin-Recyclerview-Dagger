package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui

import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.repo.ClubRepo
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.BasePresenter
import io.github.bayu1993.kotlinrecyclerviewwithdagger.utils.logD
import io.github.bayu1993.kotlinrecyclerviewwithdagger.utils.toJsonElement
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by Bayu teguh pamuji on 8/28/18.
 * email : bayuteguhpamuji@gmail.com.
 */

class MainPresenter @Inject constructor(private val clubRepo: ClubRepo) : BasePresenter<MainView>(){
    private val tag = "MainPresenter"

    fun getClubs(){
        view?.showProgress(true)
        disposable.add(
                clubRepo.getClubs()
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnComplete{view?.showProgress(false)}
                        .subscribe({
                            logD(tag,"club list : ${toJsonElement(it)}")
                            view?.displayClub(it)
                        },Throwable::printStackTrace)

        )
    }
}