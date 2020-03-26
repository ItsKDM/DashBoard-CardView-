package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    TextView tv_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        tv_add = findViewById(R.id.tv_add);
    }
}
