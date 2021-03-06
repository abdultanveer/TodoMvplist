package com.example.todomvp.addedittask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.todomvp.R;

public class AddEditActivity extends AppCompatActivity implements AddEditContract.View {

    AddEditContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new AddEditPresenter(this);
    }

    public void clickHandler(View view) {
        //1. view: mr presenter someone clicked the button
       // presenter.onButtonClicked();
        presenter.getData();
    }

    @Override
    public void showMessage(String message) {
        //3.
        TextView msgTextView = findViewById(R.id.textViewResult);
        msgTextView.setText(message);
    }
}
