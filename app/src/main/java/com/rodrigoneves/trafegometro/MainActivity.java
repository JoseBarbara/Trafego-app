package com.rodrigoneves.trafegometro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.app_escalas.EscalasActivity;
import com.rodrigoneves.trafegometro.app_falhas.FalhasActivity;
import com.rodrigoneves.trafegometro.app_fones.FonesActivity;
import com.rodrigoneves.trafegometro.app_frotas.FrotasActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    ImageView escalasImageView;
    ImageView frotaImageView;
    ImageView falhasImageView;
    ImageView fonesImageView;
    TextView escalasTextView;
    TextView frotaTextView;
    TextView falhasTextView;
    TextView fonesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        escalasImageView = findViewById(R.id.image_escalas);
        frotaImageView = findViewById(R.id.image_frotas);
        falhasImageView = findViewById(R.id.image_falhas);
        fonesImageView = findViewById(R.id.image_fones);
        escalasTextView = findViewById(R.id.text_escalas);
        frotaTextView = findViewById(R.id.text_frotas);
        falhasTextView = findViewById(R.id.text_falhas);
        fonesTextView = findViewById(R.id.text_fones);

        toolbar.setBackgroundResource(R.color.black_overlay);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);

        escalasImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EscalasActivity.class));
            }
        });
        escalasTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EscalasActivity.class));
            }
        });
        frotaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FrotasActivity.class));
            }
        });
        frotaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FrotasActivity.class));
            }
        });
        falhasImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FalhasActivity.class));
            }
        });
        falhasTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FalhasActivity.class));
            }
        });
        fonesImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FonesActivity.class));
            }
        });
        fonesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FonesActivity.class));
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.escalas) {
            startActivity(new Intent(MainActivity.this, EscalasActivity.class));
        }
        if (id == R.id.frotas) {
            startActivity(new Intent(MainActivity.this, FrotasActivity.class));
        }
        if (id == R.id.guia_falhas) {
            startActivity(new Intent(MainActivity.this, FalhasActivity.class));
        }
        if (id == R.id.telefones) {
            startActivity(new Intent(MainActivity.this, FonesActivity.class));
        }
        if (id == R.id.links) {
            startActivity(new Intent(MainActivity.this, LinkActivity.class));
        }
        if (id == R.id.about) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
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