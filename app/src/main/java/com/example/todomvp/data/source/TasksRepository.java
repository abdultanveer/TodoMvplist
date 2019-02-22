package com.example.todomvp.data.source;

import com.example.todomvp.data.Task;

/**
 * this class will check for internet connection
 * if there is net connectivity then it'll pull data from online i.e remote db
 * or if there's no connectivity then it'll pull data from local db
 */
public class TasksRepository implements TaskDataSource{

    @Override
    public void getTask() {
        //lets consider no net, so get data from local db

    }

    @Override
    public void saveTask(Task task) {

    }
}
