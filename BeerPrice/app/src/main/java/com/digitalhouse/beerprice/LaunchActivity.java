package com.digitalhouse.beerprice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                irParaLogin();

            }
        },3000);

    }

    public void irParaLogin(){
        Intent intencao = new Intent(this, BeerPriceActivity.class);
        startActivity(intencao);
    }

}
