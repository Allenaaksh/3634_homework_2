package com.example.shinelon.eat_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Shinelon on 15/10/2019.
 */

public class Homefragment extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.navibar, container, false);
        recyclerView = v.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(v.getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter adapter = new adapter();
        adapter.setData(Database.getAllFoods());
        recyclerView.setAdapter(adapter);
        return v;
    }
}
