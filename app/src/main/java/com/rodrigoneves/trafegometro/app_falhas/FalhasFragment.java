package com.rodrigoneves.trafegometro.app_falhas;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract;
import com.rodrigoneves.trafegometro.data.TrafegoDbHelper;

public class FalhasFragment extends Fragment {

    public FalhasFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        String frota = "E";
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            frota = bundle.getString("frotas");
        }

        String sql = "SELECT * from falhas where frota ='" + frota + "'";

        TrafegoDbHelper handler = new TrafegoDbHelper(getContext());
        SQLiteDatabase db = handler.getReadableDatabase();
        final Cursor falhasCursor = db.rawQuery(sql, null);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        FalhasAdapter mAdapter = new FalhasAdapter(getContext(), falhasCursor);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), DetalhesActivity.class);
                int idColumnIndex = falhasCursor.getColumnIndex(TrafegoContract.FalhasEntry._ID);
                int id = falhasCursor.getInt(idColumnIndex);
                intent.putExtra("ID", id);
                startActivity(intent);
            }
        });

        return rootView;
    }
}

