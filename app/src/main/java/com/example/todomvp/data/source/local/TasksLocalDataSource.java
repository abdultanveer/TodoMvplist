package com.example.todomvp.data.source.local;

import com.example.todomvp.data.Task;
import com.example.todomvp.data.source.TaskDataSource;

public class TasksLocalDataSource implements TaskDataSource {

    TodoDatabase database;

    public TasksLocalDataSource( ) {
        database = new TodoDatabase();
    }

    /*@Override
    public void getTask() {

    }*/

    @Override
    public void getTask(GetTaskCallback getTaskCallback) {
        database.getData(getTaskCallback);

    }

    @Override
    public void saveTask(Task task) {

    }
}
