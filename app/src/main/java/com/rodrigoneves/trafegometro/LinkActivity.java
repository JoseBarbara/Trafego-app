package com.rodrigoneves.trafegometro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outros);

        final List<Link> links = new ArrayList<>();
        links.add(new Link("Holerith",  "https://aplic.metrosp.com.br/depag/first.php"));
        links.add(new Link("Mail",  "http://outlook.com/owa/metrosp.com.br"));
        links.add(new Link("Sodexo",  "https://www.sodexobeneficios.com.br/sodexo-club/login/"));
        links.add(new Link("Aplicativos do tráfego", "https://goo.gl/M4Y67j"));

        LinksAdapter adapter = new LinksAdapter(this, (ArrayList<Link>) links);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Link link = links.get(position);
                String linkString = link.getmLink();
                Uri webpage = Uri.parse(linkString);
                startActivity(new Intent(Intent.ACTION_VIEW, webpage));
            }
        });
    }
}