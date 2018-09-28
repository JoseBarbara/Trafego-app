package com.rodrigoneves.trafegometro.app_falhas;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.rodrigoneves.trafegometro.AboutActivity;
import com.rodrigoneves.trafegometro.LinkActivity;
import com.rodrigoneves.trafegometro.MainActivity;
import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.app_escalas.EscalasActivity;
import com.rodrigoneves.trafegometro.app_fones.FonesActivity;
import com.rodrigoneves.trafegometro.app_frotas.FrotasActivity;

public class FalhasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
        navigationView.getMenu().getItem(3).setChecked(true);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        String[] pageTitle = getResources().getStringArray(R.array.page_title_falhas);
        for (int i = 0; i < 7; i++) {
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

        if (id == R.id.home) {
            startActivity(new Intent(FalhasActivity.this, MainActivity.class));
        }

        if (id == R.id.escalas) {
            startActivity(new Intent(FalhasActivity.this, EscalasActivity.class));
        }

        if (id == R.id.frotas) {
            startActivity(new Intent(FalhasActivity.this, FrotasActivity.class));
        }

        if (id == R.id.telefones) {
            startActivity(new Intent(FalhasActivity.this, FonesActivity.class));
        }
        if (id == R.id.links) {
            startActivity(new Intent(FalhasActivity.this, LinkActivity.class));
        }
        if (id == R.id.about) {
            startActivity(new Intent(FalhasActivity.this, AboutActivity.class));
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
