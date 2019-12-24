package com.example.admin.databinding

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.admin.databinding.databinding.ItemListBinding

class RecyclerviewAdapter( val user : List<User> ) : RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

       val binding : ItemListBinding = DataBindingUtil.inflate(LayoutInflater.from(parent?.context), R.layout.item_list,parent,false)
       return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.bindTo(user[position])
    }

    override fun getItemCount(): Int {

        return user.size
    }

    class ViewHolder(val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root){

        fun bindTo(userList : User){
            binding.userModel = userList

        }
    }
}