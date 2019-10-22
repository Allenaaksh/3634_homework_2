package com.example.shinelon.eat_app;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Checkout extends Fragment {
    //static int a =0;

    RecyclerView recyclerView;
    TextView price;
    int totalprice = Fooddetail.totalprice;

    public Checkout() {
        // Required empty public constructor
    }

    ArrayList<addFood> addFoodArrayList = Fooddetail.addFoodArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_checkout, container, false);
        recyclerView = v.findViewById(R.id.traylist);
        price = v.findViewById(R.id.price);
        System.out.println(totalprice);
        price.setText((Integer.toString(totalprice)));
        //Toast.makeText(getApplicationContext(), "you are in Food menu now!", Toast.LENGTH_LONG).show();
        LinearLayoutManager layoutManager = new LinearLayoutManager(v.getContext());
        recyclerView.setLayoutManager(layoutManager);
        Checkoutadapter adapter = new Checkoutadapter();
        recyclerView.setAdapter(adapter);
        return v;


    }

}


//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        ListView listView = (ListView) getActivity().findViewById(R.id.traylist);
//        listView.setAdapter(new BaseAdapter() {
//            @Override
//            public int getCount() {
//                return addFoodArrayList.size();
//            }
//
//            @Override
//            public Object getItem(int i) {
//                return addFoodArrayList.toString();
//            }
//
//            @Override
//            public long getItemId(int i) {
//                return 0;
//            }
//
//            @SuppressLint("ViewHolder")
//            @Override
//            public View getView(int i, View view, ViewGroup viewGroup) {
//                return LayoutInflater.from(getActivity()).inflate(R.layout.list, null);
//            }
//        });
//    }

