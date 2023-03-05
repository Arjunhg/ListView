package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>() //String Array of task which we need to perform
        taskList.add("Visit CP Hanuman Mandir")
        taskList.add("Attend Exam")
        taskList.add("Complete the App Dev Project")
        taskList.add("Buy bhindi from market")
        taskList.add("Work on resume")
        taskList.add("Improve internet presence")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}