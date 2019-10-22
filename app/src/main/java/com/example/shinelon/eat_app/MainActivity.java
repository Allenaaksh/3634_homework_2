package com.example.shinelon.eat_app;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navi);
        Fragment selected = new Homefragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();
        adapter adapter = new adapter();
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId()) {
                case R.id.main_menu1:
                    selected = new Homefragment();
                    break;


                case R.id.order1:
                    selected = new Checkout();

                    break;

            }


            getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();

            return true;
        }
    };
}
