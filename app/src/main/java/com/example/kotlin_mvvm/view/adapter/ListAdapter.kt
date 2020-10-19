package com.example.kotlin_mvvm.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_mvvm.databinding.ViewRepoListItemBinding
import com.example.kotlin_mvvm.model.Item
import com.example.kotlin_mvvm.view.adapter.viewHolders.ListViewHolder
import com.example.kotlin_mvvm.view.ui.repolist.ListViewModel

class ListAdapter(private val listViewModel: ListViewModel) :
    RecyclerView.Adapter<ListViewHolder>() {
    var repoList: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val dataBinding = ViewRepoListItemBinding.inflate(inflater, parent, false)
        return ListViewHolder(dataBinding, listViewModel)
    }

    override fun getItemCount() = repoList.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.setup(repoList[position])
    }

    fun updateRepoList(repoList: List<Item>) {
        this.repoList = repoList
        notifyDataSetChanged()
    }
}