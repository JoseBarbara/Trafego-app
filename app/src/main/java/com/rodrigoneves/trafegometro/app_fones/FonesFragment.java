package com.rodrigoneves.trafegometro.app_fones;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoDbHelper;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FonesEntry;

import java.util.Objects;

public class FonesFragment extends Fragment {

    public FonesFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        String linha = "1";
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            linha = bundle.getString("fones");
        }

        String sql = "SELECT * from telefones where linha='" + linha + "'";

        TrafegoDbHelper handler = new TrafegoDbHelper(getContext());
        SQLiteDatabase db = handler.getReadableDatabase();
        final Cursor fonesCursor = db.rawQuery(sql, null);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        FonesAdapter mAdapter = new FonesAdapter(getContext(), fonesCursor);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String currentCargo = fonesCursor.getString(
                        fonesCursor.getColumnIndex(FonesEntry.COLUMN_FONES_CARGO));
                if (currentCargo.equals("TRONCO")) {
                    String currentFone = fonesCursor.getString(
                            fonesCursor.getColumnIndex(FonesEntry.COLUMN_FONES_NUMERO));
                    Toast.makeText(getContext(), currentFone, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + currentFone));
                    if (intent.resolveActivity(Objects.requireNonNull(
                            getActivity()).getPackageManager()) != null) {startActivity(intent);
                    }

                }
            }
        });

        return rootView;
    }
}
