package com.example.todomvp.contentproviders;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.todomvp.R;

public class InboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);
        populateListView();
    }

    private void populateListView() {
        // take the handle of listview
        ListView inboxListView = findViewById(R.id.inboxListview);
        //get data from inbox
            //create a uri -- url
        Uri uriSMSURI = Uri.parse("content://sms/inbox");
        //http://database/tablename
        // get contentresolver query the db -- cursor
        Cursor cursor =getContentResolver().
                query(uriSMSURI,null,null,null,null);
        //select * from inbox
            //create a cursoradapter with the cursor you got above
        SimpleCursorAdapter cursorAdapter =
                new SimpleCursorAdapter(this,
                        android.R.layout.simple_list_item_1,//layout for each row in listview
                        cursor, // data
                        new String[]{"body"},//name of the column in inbox table
                        new int[]{android.R.id.text1}); //id of tv in simple list item layout
            //set the adapter on the listtview
        inboxListView.setAdapter(cursorAdapter);
    }
}
