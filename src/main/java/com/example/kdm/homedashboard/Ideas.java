package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ideas extends AppCompatActivity {

    TextView tv_ideas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideas);

        tv_ideas = findViewById(R.id.tv_ideas);
    }
}
