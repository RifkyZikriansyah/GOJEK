package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    FrameLayout btn_gofood;
    FrameLayout btn_gomart;
    FrameLayout btn_gosend;
    FrameLayout btn_goride;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_gofood = (FrameLayout) findViewById(R.id.btn_gofood);
        btn_gofood.setOnClickListener((View.OnClickListener) this);

        btn_gomart = (FrameLayout) findViewById(R.id.btn_gomart);
        btn_gomart.setOnClickListener((View.OnClickListener) this);

        btn_goride = (FrameLayout) findViewById(R.id.btn_goride);
        btn_goride.setOnClickListener((View.OnClickListener) this);

        btn_gosend = (FrameLayout) findViewById(R.id.btn_gosend);
        btn_gosend.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_gofood:
                Intent btn_gofood = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(btn_gofood);
                break;

            case R.id.btn_gomart:
                Intent btn_gomart = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com"));
                startActivity(btn_gomart);
                break;

            case R.id.btn_gosend:
                Intent btn_gosend = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gojek.com/"));
                startActivity(btn_gosend);
                break;

            case R.id.btn_goride:
                Intent btn_goride = new Intent(Intent.ACTION_VIEW, Uri.parse("https://coolors.co/"));
                startActivity(btn_goride);
                break;
            default:
                break;
        }
    }
}
