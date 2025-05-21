package com.example.studysyncandoid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studysyncandoid.adapter.TaskAdapter;
import com.example.studysyncandoid.data.TaskDatabase;
import com.example.studysyncandoid.model.Task;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editTextTask;
    Button buttonAdd;
    RecyclerView recyclerViewTasks;

    TaskDatabase db;
    List<Task> taskList;
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.facebook_login);

//        // Bind views
//        editTextTask = findViewById(R.id.editTextTask);
//        buttonAdd = findViewById(R.id.buttonAdd);
//        recyclerViewTasks = findViewById(R.id.recyclerViewTasks);
//
//        // Setup database
//        db = TaskDatabase.getInstance(this);
//        taskList = db.taskDao().getAllTasks();
//
//        // Setup RecyclerView
//        adapter = new TaskAdapter(this, taskList, db);
//        recyclerViewTasks.setLayoutManager(new LinearLayoutManager(this));
//        recyclerViewTasks.setAdapter(adapter);
//
//        // Add new task
//        buttonAdd.setOnClickListener(v -> {
//            String title = editTextTask.getText().toString().trim();
//            if (!title.isEmpty()) {
//                Task newTask = new Task();
//                newTask.title = title;
//                newTask.isDone = false;
//
//                db.taskDao().insert(newTask);
//                taskList.clear();
//                taskList.addAll(db.taskDao().getAllTasks());
//                adapter.notifyDataSetChanged();
//
//                editTextTask.setText(""); // clear input
//            }
//        });
    }
}