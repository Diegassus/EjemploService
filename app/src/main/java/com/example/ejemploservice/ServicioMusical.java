package com.example.ejemploservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class ServicioMusical extends Service {
    private MediaPlayer mp;
    //private static int cantidad = 0 ;

    @Override
    public void onCreate() {
        super.onCreate();
        //mp= MediaPlayer.create(this,R.raw.hugo_gimenez);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //if(cantidad<1){
            mp=MediaPlayer.create(this,intent.getIntExtra("tema",-1));
            mp.start();
            //cantidad++;
        //}

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mp != null){
            mp.stop();
        }
        //cantidad=0;
    }

    public ServicioMusical() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return null ;
    }
}