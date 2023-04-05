package com.example.ejemploservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        if(intent == null){
            intent = new Intent(this,ServicioMusical.class);
            intent.putExtra("tema",R.raw.hueneken);
            startService(intent);
        }

    }

    public void playSegundo(View view){
        if(intent == null){
            int nro = R.raw.hugo_gimenez;
            intent = new Intent(this,ServicioMusical.class);
            intent.putExtra("tema",nro);
            startService(intent);
        }

    }

    public void stop(View view){
        if(intent != null){
            Intent intent = new Intent(this,ServicioMusical.class);
            stopService(intent);
        }
        intent = null ;
    }
}