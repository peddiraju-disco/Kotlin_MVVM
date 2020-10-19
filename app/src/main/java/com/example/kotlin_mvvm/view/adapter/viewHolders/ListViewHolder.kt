package com.example.kotlin_mvvm.view.adapter.viewHolders

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_mvvm.BR
import com.example.kotlin_mvvm.model.Item
import com.example.kotlin_mvvm.view.ui.repolist.ListViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_repo_list_item.view.*


class ListViewHolder constructor(
    private val dataBinding: ViewDataBinding,
    private val listViewModel: ListViewModel
) : RecyclerView.ViewHolder(dataBinding.root) {

    val avatarImage = itemView.item_avatar
    fun setup(itemData: Item) {
        dataBinding.setVariable(BR.itemData, itemData)
        dataBinding.executePendingBindings()

        Picasso.get().load(itemData.owner.avatar_url).into(avatarImage);
    }
}