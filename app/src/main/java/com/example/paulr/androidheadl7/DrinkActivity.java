package com.example.paulr.androidheadl7;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = (int) getIntent().getExtras().get("drinkId");
        Drink drink = Drink.drinks[drinkId];

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView descripition = findViewById(R.id.description);
        descripition.setText(drink.getDesvtiption());

        ImageView photo =  findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
    }
}
