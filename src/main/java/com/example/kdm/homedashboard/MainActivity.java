package com.example.kdm.homedashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView sendCard, ideasCard, addCard, linksCard, wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining Card
        sendCard = (CardView)findViewById(R.id.send_card);
        ideasCard = (CardView)findViewById(R.id.ideas_card);
        addCard = (CardView)findViewById(R.id.add_card);
        linksCard = (CardView)findViewById(R.id.link_card);
        wifiCard = (CardView)findViewById(R.id.wifi_card);

        //Add Click Listener to the Cards

        sendCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.send_card:
                i = new Intent(this,Bank.class);
                startActivity(i);
                break;

            case R.id.link_card:
                i = new Intent(this, Links.class);
                startActivity(i);
                break;

            case R.id.add_card:
                i = new Intent(this, Add.class);
                startActivity(i);
                break;

            case R.id.ideas_card:
                i = new Intent(this, Ideas.class);
                startActivity(i);
                break;

            case R.id.wifi_card:
                i = new Intent(this, Wifi.class);
                startActivity(i);
                break;

            default:break;
        }

    }
}
