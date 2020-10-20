package com.example.primerproyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splash extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViewById(R.id.btr).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent ir=new Intent(this,MainActivity.class);
        startActivity(ir);
    }
}
