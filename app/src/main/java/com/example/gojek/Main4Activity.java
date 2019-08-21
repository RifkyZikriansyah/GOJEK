package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView textView =(TextView) findViewById(R.id.txt_viewnama);
        TextView textView2 =(TextView) findViewById(R.id.txt_viewalamat);
        TextView textView3 =(TextView) findViewById(R.id.txt_viewpesan);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        textView.setText(s);
        String s2 = bundle.getString("alamat");
        textView2.setText(s2);
        String s3 = bundle.getString("pesanan");
        textView3.setText(s3);
        Button button =(Button) findViewById(R.id.button_cancel);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(i);
                                      }
        }
        );

    }
}
