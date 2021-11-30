package com.metehanbolat.todoappwithcleanarchitecture.data.repository

import androidx.lifecycle.LiveData
import com.metehanbolat.todoappwithcleanarchitecture.data.ToDoDao
import com.metehanbolat.todoappwithcleanarchitecture.data.models.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }

    fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }
}