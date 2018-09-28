package com.rodrigoneves.trafegometro.app_escalas;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.rodrigoneves.trafegometro.AboutActivity;
import com.rodrigoneves.trafegometro.LinkActivity;
import com.rodrigoneves.trafegometro.MainActivity;
import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.app_falhas.FalhasActivity;
import com.rodrigoneves.trafegometro.app_fones.FonesActivity;
import com.rodrigoneves.trafegometro.app_frotas.FrotasActivity;

public class EscalasActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.view_pager);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(1).setChecked(true);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setVisibility(View.GONE);
        String[] pageTitle = {"Escalas"};
        for (int i = 0; i <1; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(pageTitle[i]));
        }

        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home){
            startActivity(new Intent(EscalasActivity.this, MainActivity.class));
        }
        if (id == R.id.frotas) {
            startActivity(new Intent(EscalasActivity.this, FrotasActivity.class));
        }
        if (id == R.id.guia_falhas) {
            startActivity(new Intent(EscalasActivity.this, FalhasActivity.class));
        }
        if (id == R.id.telefones) {
            startActivity(new Intent(EscalasActivity.this, FonesActivity.class));
        }
        if (id == R.id.links) {
            startActivity(new Intent(EscalasActivity.this, LinkActivity.class));
        }
        if (id == R.id.about) {
            startActivity(new Intent(EscalasActivity.this, AboutActivity.class));
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        assert drawerLayout != null;
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}