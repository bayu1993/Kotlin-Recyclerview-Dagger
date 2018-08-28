package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

open class BasePresenter<T : BaseView> {
    protected val disposable = CompositeDisposable()
    protected var view: T? = null

    fun bind(view:T){
        this.view = view
    }

    private fun unbind(){
        this.view = null
    }

    fun destroy(){
        if (!disposable.isDisposed)
            disposable.dispose()
        unbind()
    }
}