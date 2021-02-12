package com.ziloe.archies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CardView startersCard, mainsCard, dessertCard;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.text_view_starters_cardview);
        mainsCard = findViewById(R.id.text_view_mains_cardview);
        dessertCard = findViewById(R.id.text_view_dessert_cardview);
        email = findViewById(R.id.email_address);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainsIntent = new Intent(MainActivity.this, Mains.class);
                startActivity(mainsIntent);
            }
        });

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(dessertIntent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchemailIntent = new Intent(Intent.ACTION_SENDTO);
                launchemailIntent.setData(Uri.parse("mailto:archies@gmail.com"));
                startActivity(launchemailIntent);

            }
        });


    }
}