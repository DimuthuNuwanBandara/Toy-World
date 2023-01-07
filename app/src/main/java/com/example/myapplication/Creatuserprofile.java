package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Creatuserprofile extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatuserprofile);

        button1 = findViewById(R.id.btncreatstupr);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_reg_users);
                Toast.makeText(Creatuserprofile.this, "Login Succuss", Toast.LENGTH_SHORT).show();
            }
        });

        button2 = findViewById(R.id.btnCreatteapr);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_home_page);
               // Toast.makeText(Creatuserprofile.this, "Login Succuss", Toast.LENGTH_SHORT).show();
            }
        });
    }
}