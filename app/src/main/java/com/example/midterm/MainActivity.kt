package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // supportFragmentManager.beginTransaction().add(R.id.add_todo_fragment, AddTaskFragment()).commit()
    }

    fun onClick(view : View){
        supportFragmentManager.beginTransaction().replace(R.id.activityMain, AddTaskFragment()).commit()
    }

}
