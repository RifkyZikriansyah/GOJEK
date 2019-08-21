package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText name =(EditText) findViewById(R.id.edt_txtnama);
        final EditText alamat =(EditText) findViewById(R.id.edt_txtalamat);
        final EditText pesanan =(EditText) findViewById(R.id.edt_txtpesan);
        Button button =(Button) findViewById(R.id.button_order);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Main4Activity.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("alamat",alamat.getText().toString());
                i.putExtra("pesanan",pesanan.getText().toString());
                startActivity(i);
            }
        }
        );
    }
}
