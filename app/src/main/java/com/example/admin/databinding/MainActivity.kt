package com.example.admin.databinding

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
       Toast.makeText(this, "View clicked", Toast.LENGTH_LONG).show()
        Toast.makeText(this,"",Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        getList.layoutManager = LinearLayoutManager(this)

//using viewModel
        viewModel.observeList.observe(this, Observer {
            it?: return@Observer  // because at first user will b null
                getList.adapter = RecyclerviewAdapter(it, this)
        })

        viewModel.getList()
    }

    //without viewModel
 //   private fun userList() : List<User>{

//        val userList = ArrayList<User>()
//        userList.add(User("Tehreem", "53"))
//        userList.add(User("Bisma","61"))
//        userList.add(User("Yawar","55"))
//        return userList

   // }
}
