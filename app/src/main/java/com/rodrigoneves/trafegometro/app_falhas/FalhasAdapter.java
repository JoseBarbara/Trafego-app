package com.rodrigoneves.trafegometro.app_falhas;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FalhasEntry;

public class FalhasAdapter extends CursorAdapter {
    public FalhasAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item_falhas, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView falhaTextView = (TextView) view.findViewById(R.id.list_item_falha);

        int falhaColumnIndex = cursor.getColumnIndex(FalhasEntry.COLUMN_FALHAS_FALHA);
        String currentFalha = cursor.getString(falhaColumnIndex);
        falhaTextView.setText(currentFalha);
    }
}
