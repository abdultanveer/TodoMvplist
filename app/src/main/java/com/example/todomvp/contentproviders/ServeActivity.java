package com.example.todomvp.contentproviders;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.todomvp.R;

public class ServeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serve);
    }

    public void handleClick(View view) {
        Intent  bindIntent = new Intent(ServeActivity.this,BindService.class);

        switch (view.getId()){
            case R.id.buttonUnbind:
                unbindService(serviceConnection);
                break;
            case R.id.buttonbind:
                //step 1
                bindService(bindIntent,serviceConnection, Context.BIND_AUTO_CREATE);//bind autocreate -- if the service is not running then create it
                break;
        }



      }

    BindService bindService;
    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder mbinder) {
            //step 3
            // you'll get the running instance of the service, you're not creating an instance of the service
            BindService.LocalBinder binder = (BindService.LocalBinder) mbinder;
            bindService = binder.getService(); // this will get me an instance of the running service;
            int randomNo = bindService.getRandomNumber();
            Toast.makeText(ServeActivity.this, "random no ="+randomNo, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


}
