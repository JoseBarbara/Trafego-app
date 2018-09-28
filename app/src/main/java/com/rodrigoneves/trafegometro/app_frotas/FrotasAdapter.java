package com.rodrigoneves.trafegometro.app_frotas;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FrotaEntry;

class FrotasAdapter extends CursorAdapter {

    public FrotasAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView nameTextView = view.findViewById(R.id.nome_frota);
        int nameColumnIndex = cursor.getColumnIndex(FrotaEntry.COLUMN_FROTAS_NOME);
        String frotaName = cursor.getString(nameColumnIndex);
        nameTextView.setText(frotaName);

        int linhaColumnIndex = cursor.getColumnIndex(FrotaEntry.COLUMN_FROTAS_LINHA);
        int frotaLinhaInt = Integer.parseInt(cursor.getString(linhaColumnIndex));

        switch (frotaLinhaInt) {
            case 1:
                nameTextView.setBackgroundResource(R.color.category_azul);
                break;
            case 2:
                nameTextView.setBackgroundResource(R.color.category_verde);
                break;
            case 3:
                nameTextView.setBackgroundResource(R.color.category_vermelho);
                break;
            case 5:
                nameTextView.setBackgroundResource(R.color.category_lilas);
                break;
            default:
                nameTextView.setBackgroundResource(R.color.category_prata);
                break;
        }
    }
}