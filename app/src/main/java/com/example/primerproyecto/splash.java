package com.example.primerproyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class splash extends Activity{
    TextView e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        e =findViewById(R.id.txt);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                long t=  (l/1000);
                String str=String.valueOf(t);
                e.setText(str);
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }

        }.start();

    }


    }

