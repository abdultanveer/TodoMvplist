package com.example.todomvp.addedittask;

import com.example.todomvp.data.Task;
import com.example.todomvp.data.source.TaskDataSource;
import com.example.todomvp.data.source.TasksRepository;

public class AddEditPresenter implements AddEditContract.Presenter,TaskDataSource.GetTaskCallback{
    AddEditContract.View view;
    TaskDataSource repository;

    public AddEditPresenter(AddEditActivity activity) {

        view = activity;
        repository = new TasksRepository();
    }

    @Override
    public void onButtonClicked() {
        //2.presenter : hey mr view show a msg on textview
        view.showMessage("welcome to mvp");
    }

    @Override
    public void getData() {
        repository.getTask(this);
    }

    @Override
    public void onTaskLoaded(Task task) {
        view.showMessage(task.getTitle()+"\n"+task.getDescription());

    }
}
