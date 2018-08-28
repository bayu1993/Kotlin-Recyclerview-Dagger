package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.adapter

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
abstract class BaseViewHolder<T : Parcelable> : RelativeLayout {

    constructor(context:Context?):super(context){
        init()
    }

    constructor(context: Context?, attrs:AttributeSet?): super(context, attrs){
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr:Int):super(context, attrs, defStyleAttr){
        init()
    }

    private fun init() {
        View.inflate(context, layoutResID(), this)
    }

    protected abstract fun layoutResID(): Int

    abstract fun bind(item:T)
}