package com.example.myapplication21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b3 = (Button)findViewById(R.id.regist);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LoginActivity2.this, RegistrActivity.class);
                startActivity(intent);
            }
        });
    }
}