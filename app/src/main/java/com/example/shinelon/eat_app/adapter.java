package com.example.shinelon.eat_app;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Shinelon on 15/10/2019.
 */

public class adapter extends RecyclerView.Adapter<adapter.Viewholder> {

    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt) {

        this.foodToAdapt = foodToAdapt;
    }
    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        final Food foodAtPosition = foodToAdapt.get(position);

        holder.foodDiscrip.setText(foodAtPosition.getFoodDesc());
        holder.price.setText(String.valueOf(foodAtPosition.getPrice()));

        holder.foodname.setText(foodAtPosition.getFoodName());
        holder.price.setText(Integer.toString(foodAtPosition.getPrice()));
        holder.foodpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, Fooddetail.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }

        });
        holder.foodpicture.setImageResource(foodAtPosition.getImageDrawableId());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, Fooddetail.class);
                intent.putExtra("foodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }

        });
        holder.foodpicture.setImageResource(foodAtPosition.getImageDrawableId());


    }
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foodlist, parent, false);
        Viewholder userViewHolder = new Viewholder(view);
        return userViewHolder;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView foodpicture;
        TextView foodname;
        TextView foodDiscrip;
        TextView price;
        ConstraintLayout constraintLayout;


        public Viewholder(View itemView) {
            super(itemView);
            foodpicture = itemView.findViewById(R.id.foodpicture);
            foodname = itemView.findViewById(R.id.fooddisc);
            price = itemView.findViewById(R.id.price);
            constraintLayout = itemView.findViewById(R.id.constraintlayout);
            foodDiscrip = itemView.findViewById(R.id.fooddiscrip);

        }
    }


    private FragmentManager getSupportFragmentManager() {
        return null;
    }


    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }
}
