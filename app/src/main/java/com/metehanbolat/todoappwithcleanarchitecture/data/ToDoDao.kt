package com.metehanbolat.todoappwithcleanarchitecture.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.metehanbolat.todoappwithcleanarchitecture.data.models.ToDoData

@Dao
interface ToDoDao {

    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllData(): LiveData<List<ToDoData>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertData(toDoData: ToDoData)

    @Update
    fun updateData(toDoData: ToDoData)

    @Delete
    fun deleteItem(toDoData: ToDoData)

    @Query("DELETE FROM todo_table")
    fun deleteAll()

}