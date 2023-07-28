package com.fpoly.drawernavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ActivityBai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        BottomNavigationView btnNavigation = findViewById(R.id.btnNavigation);

        btnNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home_navigation){
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutBai3,new Fragment_home()).commit();
                    return true;
                }else if (item.getItemId() == R.id.map){
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutBai3,new Fragment_map()).commit();
                    return true;
                } else if (item.getItemId() == R.id.image_) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutBai3,new Fragment_image()).commit();
                    return true;
                }

                return false;
            }
        });
    }
}