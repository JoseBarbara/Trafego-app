package com.rodrigoneves.trafegometro.app_frotas;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FrotaEntry;
import com.rodrigoneves.trafegometro.data.TrafegoDbHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class FrotasFragment extends Fragment {


    public FrotasFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grid_view, container, false);

        String sortOrder = "linha";

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            sortOrder = bundle.getString("sortOrder");
        }

        TrafegoDbHelper handler = new TrafegoDbHelper(getContext());
        SQLiteDatabase db = handler.getReadableDatabase();
        final Cursor frotaCursor = db.rawQuery("SELECT * from frotas ORDER BY " + sortOrder, null);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        FrotasAdapter mAdapter = new FrotasAdapter(getContext(), frotaCursor);
        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String frotaname = frotaCursor.getString(frotaCursor.getColumnIndex(FrotaEntry.COLUMN_FROTAS_NOME));
                String frotaLinha = frotaCursor.getString(frotaCursor.getColumnIndex(FrotaEntry.COLUMN_FROTAS_LINHA));
                String frota = frotaCursor.getString(frotaCursor.getColumnIndex(FrotaEntry.COLUMN_FROTAS_FROTA));
                String toastString = frotaname + "\nFrota " + frota + "\nLinha " + frotaLinha;
                Toast.makeText(getContext(), toastString, Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
