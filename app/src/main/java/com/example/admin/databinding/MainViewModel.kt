package com.example.admin.databinding

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var _observeState = MutableLiveData<List<User>>()
    val observeList : LiveData<List<User>>
        get() = _observeState

    fun getList(){

        val userList = ArrayList<User>()

        userList.add(User("Tehreem","53"))
        userList.add(User("Bisma","61"))
        userList.add(User("Yawar","55"))
        _observeState.value = userList

    }
}