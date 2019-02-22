package com.example.todomvp.data.source.local;

import com.example.todomvp.data.Task;
import com.example.todomvp.data.source.TaskDataSource;

public class TodoDatabase {

    /**
     * this method queries the sqlitedb and returns a string
     * @return
     * @param getTaskCallback
     */
    public  void getData(TaskDataSource.GetTaskCallback getTaskCallback){
        Task task = new Task("dbtitle","dbDescription");
        getTaskCallback.onTaskLoaded(task);
          //"message from db";
    }
}
