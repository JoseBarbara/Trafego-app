package com.rodrigoneves.trafegometro.app_falhas;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FalhasEntry;
import com.rodrigoneves.trafegometro.data.TrafegoDbHelper;

import java.util.Objects;

public class DetalhesActivity extends AppCompatActivity {

    TextView falhaTextView;
    TextView sintomaTextView;
    TextView solucaoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        int id = intent.getIntExtra("ID", 1);
        String sql = "SELECT * from falhas where _id=";

        falhaTextView = (TextView) findViewById(R.id.falha);
        sintomaTextView = (TextView) findViewById(R.id.sintoma);
        solucaoTextView = (TextView) findViewById(R.id.solucao);

        TrafegoDbHelper handler = new TrafegoDbHelper(this);
        SQLiteDatabase db = handler.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql + id, null);
        try {
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    String currentFrota = cursor.getString(
                            cursor.getColumnIndex(FalhasEntry.COLUMN_FALHAS_FROTA)
                    );
                    String currentFalha = cursor.getString(
                            cursor.getColumnIndex(FalhasEntry.COLUMN_FALHAS_FALHA)
                    );
                    String currentSintoma = cursor.getString(
                            cursor.getColumnIndex(FalhasEntry.COLUMN_FALHAS_SINTOMA)
                    );
                    String currentSolucao = cursor.getString(
                            cursor.getColumnIndex(FalhasEntry.COLUMN_FALHAS_SOLUCAO)
                    );
                    String toolbar = getResources().getString(R.string.app_name_falhas) +
                            " - Frota " + currentFrota;
                    Objects.requireNonNull(getSupportActionBar()).setTitle(toolbar);
                    falhaTextView.setText(currentFalha);
                    sintomaTextView.setText(currentSintoma);
                    solucaoTextView.setText(currentSolucao);
                }
            }
        } finally {
            assert cursor != null;
            cursor.close();
        }
    }
}
