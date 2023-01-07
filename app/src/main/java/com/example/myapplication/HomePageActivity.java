package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

private  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button = findViewById(R.id.btnTechupdate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_reg_users);
                Toast.makeText(HomePageActivity.this, "Register Success", Toast.LENGTH_SHORT).show();
            }
        });
            }

}