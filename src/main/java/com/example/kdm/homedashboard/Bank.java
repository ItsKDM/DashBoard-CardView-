package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bank extends AppCompatActivity {

    TextView tv_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        tv_send = findViewById(R.id.tv_send);
    }
}
