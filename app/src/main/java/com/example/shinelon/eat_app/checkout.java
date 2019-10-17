package com.example.shinelon.eat_app;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class checkout extends Fragment {


    public checkout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_checkout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView listView = (ListView) getActivity().findViewById(R.id.traylist);
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public Object getItem(int i) {
                return 1;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @SuppressLint("ViewHolder")
            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                return LayoutInflater.from(getActivity()).inflate(R.layout.list, null);
            }
        });
    }
}
