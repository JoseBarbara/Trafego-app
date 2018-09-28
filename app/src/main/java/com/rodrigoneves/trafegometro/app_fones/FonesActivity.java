package com.rodrigoneves.trafegometro.app_fones;

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
import com.rodrigoneves.trafegometro.app_falhas.FalhasActivity;
import com.rodrigoneves.trafegometro.app_frotas.FrotasActivity;

public class FonesActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ViewPager viewPager;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        viewPager = findViewById(R.id.view_pager);
        Toolbar toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);

        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(4).setChecked(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        final TabLayout tabLayout = findViewById(R.id.tab_layout);
        String[] pageTitle = getResources().getStringArray(R.array.page_title_fones);
        for (int i = 0; i < 5; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(pageTitle[i]));
        }
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.category_azul, null));

        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                int[] tabColor = {R.color.category_azul, R.color.category_verde, R.color.category_vermelho,
                R.color.category_prata, R.color.category_apoio};
                int position = tab.getPosition();
                tabLayout.setSelectedTabIndicatorColor(getResources().getColor(tabColor[position], null));
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
            startActivity(new Intent(FonesActivity.this, MainActivity.class));
        }

        if (id == R.id.escalas) {
            startActivity(new Intent(FonesActivity.this, EscalasActivity.class));
        }

        if (id == R.id.frotas) {
            startActivity(new Intent(FonesActivity.this, FrotasActivity.class));
        }

        if (id == R.id.guia_falhas) {
            startActivity(new Intent(FonesActivity.this, FalhasActivity.class));
        }
        if (id == R.id.links) {
            startActivity(new Intent(FonesActivity.this, LinkActivity.class));
        }
        if (id == R.id.about) {
            startActivity(new Intent(FonesActivity.this, AboutActivity.class));
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
