package com.example.shinelon.eat_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class checkoutadapter extends RecyclerView.Adapter<checkoutadapter.Viewholder> {

    static int totalprice ;
    static ArrayList<String>  array;
    ArrayList<addFood> addFoodArrayList = fooddetail.addFoodArrayList;

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        Viewholder userViewHolder = new Viewholder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        final addFood foodAtPosition = addFoodArrayList.get(position);
        System.out.println(totalprice);



        holder.foodname.setText(foodAtPosition.getFoodName());
        holder.price.setText(Integer.toString(foodAtPosition.getPrice()));
        holder.Numberselected.setText(Integer.toString(foodAtPosition.getNumberselected()));
        holder.imageView.setImageResource(foodAtPosition.getImage());

        // holder.foodname.setText(foodAtPosition.getFoodName());

    }

    @Override
    public int getItemCount() {
        return addFoodArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView foodname;
        TextView Numberselected;
        TextView price;
        ImageView imageView;

        public Viewholder(View itemView) {
            super(itemView);
            foodname = itemView.findViewById(R.id.fooditem);
            //TextView ordernumber;
            price = itemView.findViewById(R.id.foodprice);
            Numberselected = itemView.findViewById(R.id.numberselection);
            imageView = itemView.findViewById(R.id.foodpic);

        }
    }


}
