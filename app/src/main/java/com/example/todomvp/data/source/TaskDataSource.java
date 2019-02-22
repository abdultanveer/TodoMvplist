package com.example.todomvp.data.source;

import com.example.todomvp.data.Task;

import java.util.List;

public interface TaskDataSource {

    interface  LoadTaskCallback{
        /**
         *  this will be called when it is ready with the data i.e list of tasks
         * @param taskList
         */
        void onTasksLoaded(List<Task> taskList);
    }
    interface  GetTaskCallback{
        /**
         *  this will be called when it is ready with the data i.e one task
         * @param task
         */
        void onTaskLoaded(Task task);
    }

    /**
    * this will query the db
     */
   void getTask(GetTaskCallback getTaskCallback);

    /**
     * this will save the task in db
     * @param task
     */
    void saveTask(Task task);
}
