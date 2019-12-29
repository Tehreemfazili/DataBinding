package com.example.admin.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
       Toast.makeText(this,"View clicked", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getList.layoutManager = LinearLayoutManager(this)
        getList.adapter = RecyclerviewAdapter(userList(), this)
    }

    private fun userList() : List<User>{

        val userList = ArrayList<User>()
        userList.add(User("Tehreem", "53"))
        userList.add(User("Bisma","61"))
        userList.add(User("Yawar","55"))
        return userList

    }
}
