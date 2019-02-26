package com.example.todomvp.contentproviders;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

/**
 * this service servers some random no, some message, score
 */
public class BindService extends Service {
    private final IBinder mbinder = new LocalBinder();
    private final Random mGenerator = new Random();

    /**
     * binder is like a pipe, communication channel
     * the difference of sending the data through an intent and a binder is
     * intent = sms, binder = call [exchange of data is synchronous]
     */
    public class LocalBinder extends Binder {
        BindService getService() {
            // Return this instance of LocalService so clients can call public methods
            return BindService.this;
        }
    }

    public BindService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //step 2
       // throw new UnsupportedOperationException("Not yet implemented");
        return mbinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
         super.onUnbind(intent);
        Toast.makeText(BindService.this, "service disconnected", Toast.LENGTH_SHORT).show();

        return false;
    }

    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(BindService.this, "service destroyed", Toast.LENGTH_SHORT).show();

    }
}
