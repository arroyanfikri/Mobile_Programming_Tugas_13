package com.royyan.senengmovie13.utils

import androidx.recyclerview.widget.DiffUtil
import com.royyan.senengmovie13.data.model.TvShowResponse

class DivTvShowCallback(private val oldItem: List<TvShowResponse>, private val newItem: List<TvShowResponse>): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id
}