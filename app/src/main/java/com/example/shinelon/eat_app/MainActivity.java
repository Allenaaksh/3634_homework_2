package com.example.shinelon.eat_app;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //public static ArrayList<addFood> addFoodArrayList = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navi);
//       recyclerView = findViewById(R.id.recyclerview);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter food = new adapter();
//        recyclerView.setAdapter(food);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navi);

        Fragment selected = new Homefragent();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();
        adapter adapter = new adapter();
       // FragmentManager fragmentManager = getSupportFragmentManager();
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId()) {
                case R.id.main_menu1:
                    selected = new Homefragent();
                    // Toast.makeText(getApplicationContext(), "you are in Food menu now!", Toast.LENGTH_LONG).show();
                    break;


                case R.id.order1:
                    selected = new checkout();
                    // Toast.makeText(getApplicationContext(), "You are in your tray now!", Toast.LENGTH_LONG).show();

                    break;

            }


            getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();

            return true;
        }
    };
}
