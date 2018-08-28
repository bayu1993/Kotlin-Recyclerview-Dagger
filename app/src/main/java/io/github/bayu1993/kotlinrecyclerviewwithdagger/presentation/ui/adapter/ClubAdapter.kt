package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui.adapter

import android.content.Context
import io.github.bayu1993.kotlinrecyclerviewwithdagger.R
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.adapter.BaseListAdapter
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.base.adapter.BaseViewHolder
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club
import kotlinx.android.synthetic.main.item_club.view.*
import javax.inject.Inject

/**
 * Created by Bayu teguh pamuji on 8/28/18.
 * email : bayuteguhpamuji@gmail.com.
 */

class ClubAdapter @Inject constructor() : BaseListAdapter<Club>(){
    override fun getListItemView(context: Context): BaseViewHolder<Club> = ViewHolder(context)
    inner class ViewHolder(context: Context?):BaseViewHolder<Club>(context){
        override fun layoutResID(): Int {
            return R.layout.item_club
        }

        override fun bind(item: Club) {
            tv_name.text = item.name
            tv_key.text = item.key
            tv_code.text = item.code
        }

    }

}