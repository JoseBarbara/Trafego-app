package com.rodrigoneves.trafegometro.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FrotaEntry;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FalhasEntry;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FonesEntry;

public class TrafegoDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "trafego.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_FROTAS_TABLE =
            "CREATE TABLE " + FrotaEntry.TABLE_NAME + " (" +
                    FrotaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FrotaEntry.COLUMN_FROTAS_FROTA + " TEXT NOT NULL, " +
                    FrotaEntry.COLUMN_FROTAS_LINHA + " TEXT NOT NULL, " +
                    FrotaEntry.COLUMN_FROTAS_NOME + " TEXT NOT NULL UNIQUE);";

    private static final String SQL_CREATE_FONES_TABLE =
            "CREATE TABLE " + FonesEntry.TABLE_NAME + " (" +
                    FonesEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FonesEntry.COLUMN_FONES_LINHA + " TEXT NOT NULL, " +
                    FonesEntry.COLUMN_FONES_POSTO + " TEXT NOT NULL, " +
                    FonesEntry.COLUMN_FONES_CARGO + " TEXT NOT NULL, " +
                    FonesEntry.COLUMN_FONES_NUMERO + " TEXT NOT NULL);";

    private static final String SQL_CREATE_FALHAS_TABLE =
            "CREATE TABLE " + FalhasEntry.TABLE_NAME + " (" +
                    FalhasEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FalhasEntry.COLUMN_FALHAS_FROTA + " TEXT NOT NULL, " +
                    FalhasEntry.COLUMN_FALHAS_FALHA + " TEXT NOT NULL, " +
                    FalhasEntry.COLUMN_FALHAS_SINTOMA + " TEXT NOT NULL, " +
                    FalhasEntry.COLUMN_FALHAS_SOLUCAO + " TEXT NOT NULL);";

    public TrafegoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FROTAS_TABLE);
        db.execSQL(SQL_CREATE_FONES_TABLE);
        db.execSQL(SQL_CREATE_FALHAS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + FrotaEntry.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + FonesEntry.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + FalhasEntry.TABLE_NAME);
            onCreate(db);
        }
    }
}
