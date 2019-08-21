package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private int loading = 3000;
    //3000 = 3dtk

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Main2Activity = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(Main2Activity);
                finish();
            }
        },loading);
    }
}
