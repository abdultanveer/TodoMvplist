package com.example.todomvp.data.source;

import com.example.todomvp.data.Task;
import com.example.todomvp.data.source.local.TasksLocalDataSource;

/**
 * this class will check for internet connection
 * if there is net connectivity then it'll pull data from online i.e remote db
 * or if there's no connectivity then it'll pull data from local db
 */
public class TasksRepository implements TaskDataSource{
    TaskDataSource localTaskDataSource;

    public TasksRepository() {
        localTaskDataSource = new TasksLocalDataSource();
    }


    @Override
    public void getTask(GetTaskCallback getTaskCallback) {
        //lets consider no net, so get data from local db
        localTaskDataSource.getTask(getTaskCallback);

    }

    @Override
    public void saveTask(Task task) {
        //we'll save the data to the local db

    }
}
