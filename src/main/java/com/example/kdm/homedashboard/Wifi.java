package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Wifi extends AppCompatActivity {

    TextView tv_wifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        tv_wifi = findViewById(R.id.tv_wifi);
    }
}
