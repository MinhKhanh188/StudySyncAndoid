package com.example.studysyncandoid.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.studysyncandoid.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insert(Task task);

    @Query("SELECT * FROM Task")
    List<Task> getAllTasks();

    @Delete
    void delete(Task task);
}