package com.rodrigoneves.trafegometro;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final TextView versionTextView = findViewById(R.id.about);
        final ImageView easterImageView = findViewById(R.id.easter);
        String version = "";
        try {
            PackageInfo packageInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            version = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        versionTextView.setText(String.format("%s %s", String.valueOf(getText(R.string.versao)), version));
        versionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i ++;
                if (i == 10) {
                    easterImageView.setVisibility(View.VISIBLE);
                    versionTextView.setVisibility(View.GONE);
                    i = 0;
                }
            }
        });
    }
}
