package com.example.shinelon.eat_app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shinelon on 15/10/2019.
 */

public class adapter extends Adapter<adapter.Viewholder> {

    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.foodToAdapt = foodToAdapt;
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
            // textview = itemView.findViewById(R.id.content2);
            foodname = itemView.findViewById(R.id.foodname);
            price = itemView.findViewById(R.id.price);
            constraintLayout = itemView.findViewById(R.id.constraintlayout);
            foodDiscrip = itemView.findViewById(R.id.fooddiscrip);

        }
    }
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foodlist, parent, false);
        Viewholder userViewHolder = new Viewholder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        final Food foodAtPosition = foodToAdapt.get(position);

        holder.foodDiscrip.setText(foodAtPosition.getFoodDesc());

        holder.foodname.setText(foodAtPosition.getFoodName());
       // holder.price.setText(Integer.toString(foodAtPosition.getPrice()));
        holder.foodpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, fooddetail.class);
                context.startActivity(intent);
            }

        });
       // holder.foodpicture.setImageResource(foodAtPosition.getImageDrawableId());


    }

    private FragmentManager getSupportFragmentManager() {
        return null;
    }


    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }
}
