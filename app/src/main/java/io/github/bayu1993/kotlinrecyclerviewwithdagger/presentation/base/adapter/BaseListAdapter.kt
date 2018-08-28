package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.adapter

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import java.util.*

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

abstract class BaseListAdapter<T : Parcelable> : RecyclerView.Adapter<BaseListAdapter<T>.ViewHolder>() {
    private var items = ArrayList<T>()

    abstract fun getListItemView(context: Context): BaseViewHolder<T>

    fun clearItem(){
        items.clear()
        notifyItemRangeRemoved(0, items.size)
    }

    fun addItems(itemsToAdd:List<T>){
        items.addAll(itemsToAdd)
        notifyItemRangeInserted(0,itemsToAdd.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(getListItemView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.view.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(val view: BaseViewHolder<T>) : RecyclerView.ViewHolder(view)
}