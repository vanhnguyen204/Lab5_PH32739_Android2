package com.fpoly.drawernavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class ActivityBai1AndBai2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
   public Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(
                ActivityBai1AndBai2.this,
                drawerLayout,
                toolbar,
                R.string.nav_open,
                R.string.nav_close
        );

        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);


        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.home) {

                    Fragment fragment = new Fragment_home();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                    drawerLayout.close();
                    return true;
                } else if (item.getItemId() == R.id.bookmark) {

                    Fragment fragment  = new Fragment_bookmarks();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();

                    drawerLayout.close();
                    return true;
                }else if (item.getItemId() == R.id.setting){

                    Fragment fragment  = new Fragment_setting();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragment).commit();
                    drawerLayout.close();
                    return true;
                }else {
                    finish();
                }
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        return true;
    }
}