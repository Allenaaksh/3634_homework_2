package com.example.shinelon.eat_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

/**
 * Created by Shinelon on 17/10/2019.
 */

public class fooddetail extends AppCompatActivity {
    TextView fooddisc;
    TextView textView1;
    Intent intent;
    Button addtocart;
    ImageView foodpic;
    public static ArrayList<addFood> addFoodArrayList = new ArrayList<>();
    static int number = 1;
    TextView foodname;
    static int totalprice=0;

    public fooddetail() {
        // Required empty public constructor
    }
    TextView price1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();
        //addFoodArrayList = intent.getStringArrayListExtra("addFoodArrayList");

        final int foodID = intent.getIntExtra("foodID", 0);


        final Food food = Database.getFoodById(foodID);
        setContentView(R.layout.fooddetail);
        foodname = findViewById(R.id.fooodname);
        foodpic = findViewById(R.id.foodpic);
        addtocart = findViewById(R.id.addtocart);
        fooddisc = findViewById(R.id.fooddisc);
        addtocart = findViewById(R.id.addtocart);
        //price1 = findViewById(R.id.price1);
        intent = getIntent();

        foodpic.setImageResource(food.getImageDrawableId());
        fooddisc.setText(food.getFoodDesc());
        fooddisc.setText(food.getFoodDesc());
        foodname.setText(food.getFoodName());

        final ElegantNumberButton elegantNumberButton = findViewById(R.id.numberbutton);
        elegantNumberButton.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = Integer.parseInt(elegantNumberButton.getNumber());
                System.out.println(number);
            }
        });

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFood newfood = new addFood(food.getFoodName(), food.getPrice() * number, number, food.getImageDrawableId());
                addFoodArrayList.add(newfood);
                Context context = view.getContext();
                Intent intent = new Intent(context, MainActivity.class);
                //intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
                System.out.println("arraylist size before loop"+addFoodArrayList.size());
                System.out.println("total price before loop"+totalprice);


                    int z = addFoodArrayList.get(addFoodArrayList.size()-1).getPrice()*number;
                    totalprice = z + totalprice;


                System.out.println(" size after loop"+addFoodArrayList.size());
                System.out.println(totalprice);
                Toast.makeText(getApplicationContext(), "Your food has been added to cart!!", Toast.LENGTH_LONG).show();
            }

        });


    }

}


