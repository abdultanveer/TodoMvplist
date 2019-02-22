package com.example.todomvp;

public class AddEditPresenter implements AddEditContract.Presenter {
    AddEditContract.View view;

    public AddEditPresenter(AddEditActivity activity) {
        view = activity;
    }

    @Override
    public void onButtonClicked() {
        //2.presenter : hey mr view show a msg on textview
        view.showMessage("welcome to mvp");
    }
}
