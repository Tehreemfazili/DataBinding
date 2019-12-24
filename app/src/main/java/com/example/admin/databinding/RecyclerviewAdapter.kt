package com.example.admin.databinding

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecyclerviewAdapter( val user : List<User>) : RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        return (ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_list,parent,false)))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.bindTo(user[position])
    }

    override fun getItemCount(): Int {

        return user.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        var userName = view.findViewById<TextView>(R.id.getUserName)
        var weight = view.findViewById<TextView>(R.id.getUserWeight)

        fun bindTo(userList : User){
            userName.text = userList.userName
            weight.text = userList.weight
        }
    }
}