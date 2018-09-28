package com.rodrigoneves.trafegometro.app_fones;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FonesEntry;

class FonesAdapter extends CursorAdapter {
    public FonesAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView headerTextView = (TextView) view.findViewById(R.id.header_item);
        TextView itemTextView = (TextView) view.findViewById(R.id.list_item);
        TextView numeroTextView = (TextView) view.findViewById(R.id.numero_item);

        int headerColumnIndex = cursor.getColumnIndex(FonesEntry.COLUMN_FONES_POSTO);
        String header = cursor.getString(headerColumnIndex);

        int cargoColumnIndex = cursor.getColumnIndex(FonesEntry.COLUMN_FONES_CARGO);
        int foneColumnIndex = cursor.getColumnIndex(FonesEntry.COLUMN_FONES_NUMERO);
        String currentCargo = cursor.getString(cargoColumnIndex);
        String currentFone = cursor.getString(foneColumnIndex);

        headerTextView.setText(header);
        itemTextView.setText(currentCargo);
        numeroTextView.setText(currentFone);
    }
}
