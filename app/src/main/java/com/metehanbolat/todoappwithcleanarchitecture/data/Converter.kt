package com.metehanbolat.todoappwithcleanarchitecture.data

import androidx.room.TypeConverter
import com.metehanbolat.todoappwithcleanarchitecture.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}