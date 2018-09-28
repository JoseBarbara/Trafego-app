package com.rodrigoneves.trafegometro.app_frotas;

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

import com.rodrigoneves.trafegometro.AboutActivity;
import com.rodrigoneves.trafegometro.LinkActivity;
import com.rodrigoneves.trafegometro.MainActivity;
import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.app_escalas.EscalasActivity;
import com.rodrigoneves.trafegometro.app_falhas.FalhasActivity;
import com.rodrigoneves.trafegometro.app_fones.FonesActivity;

public class FrotasActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        navigationView.getMenu().getItem(2).setChecked(true);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        String[] pageTitle = getResources().getStringArray(R.array.page_title_frotas);
        for (int i = 0; i < 2; i++) {
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
            startActivity (new Intent(FrotasActivity.this, MainActivity.class));
        }

        if (id == R.id.escalas) {
            startActivity (new Intent(FrotasActivity.this, EscalasActivity.class));
        }

        if (id == R.id.guia_falhas) {
            startActivity(new Intent(FrotasActivity.this, FalhasActivity.class));
        }

        if (id == R.id.telefones) {
            startActivity (new Intent(FrotasActivity.this, FonesActivity.class));
        }
        if (id == R.id.links) {
            startActivity(new Intent(FrotasActivity.this, LinkActivity.class));
        }
        if (id == R.id.about) {
            startActivity(new Intent(FrotasActivity.this, AboutActivity.class));
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
