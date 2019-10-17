package com.example.shinelon.eat_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

/**
 * Created by Shinelon on 17/10/2019.
 */

public class fooddetail extends AppCompatActivity {
    TextView fooddisc;
    NumberPicker numberPicker;
    TextView textView1;
    Intent intent;
    Button addtocart;
    ImageView foodpic;
    public fooddetail() {
        // Required empty public constructor
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooddetail);
        foodpic = findViewById(R.id.foodpic);
        addtocart = findViewById(R.id.addtocart);
        fooddisc = findViewById(R.id.fooddisc);
        addtocart = findViewById(R.id.addtocart);
        numberPicker = findViewById(R.id.numberPicker);
        intent = getIntent();







    }
}
