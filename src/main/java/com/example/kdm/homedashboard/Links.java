package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Links extends AppCompatActivity {

    TextView tv_links;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        tv_links = findViewById(R.id.tv_links);
    }
}
