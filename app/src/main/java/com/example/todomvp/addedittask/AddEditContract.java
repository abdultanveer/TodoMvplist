package com.example.todomvp.addedittask;

/**
 * buttons on music player
 */
public interface AddEditContract {
    /**
     * presenter talking to the view
     */
    interface View{
        void showMessage(String message);
    }

    /**
     * view talking to the presenter
     */
    interface  Presenter{
        void onButtonClicked();
        void getData();
    }
}
