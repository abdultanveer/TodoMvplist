package com.example.todomvp;

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
    }
}
