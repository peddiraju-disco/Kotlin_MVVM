package com.example.kotlin_mvvm.view.ui.repolist

import androidx.lifecycle.MutableLiveData
import com.example.kotlin_mvvm.model.Item
import com.example.kotlin_mvvm.model.Repository
import com.example.kotlin_mvvm.view.base.BaseViewModel

class ListViewModel : BaseViewModel() {
    val repoListLive = MutableLiveData<List<Item>>()

    fun fetchRepoList() {
        dataLoading.value = true
        Repository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response?.items
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }
}