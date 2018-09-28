package com.rodrigoneves.trafegometro.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.rodrigoneves.trafegometro.R;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FonesEntry;
import com.rodrigoneves.trafegometro.data.TrafegoContract.FrotaEntry;

import static com.rodrigoneves.trafegometro.data.TrafegoContract.FalhasEntry.*;

public class InsertData {
    private final Context mContext;

    private static final String FROTA_E = "E";
    private static final String FROTA_G = "G";
    private static final String FROTA_H = "H";
    private static final String FROTA_I = "I";
    private static final String FROTA_J = "J";
    private static final String FROTA_K = "K";
    private static final String FROTA_L = "L";
    private static final String FROTA_M = "M";

    private static final String LINHA_1 = "1";
    private static final String LINHA_2 = "2";
    private static final String LINHA_3 = "3";
    private static final String LINHA_15 = "15";
    private static final String APOIO = "Apoio";

    private static final String POSTO_JAT = "JAT";
    private static final String POSTO_PAT = "PAT";
    private static final String POSTO_ANT = "ANT";
    private static final String POSTO_PTT = "PTT";
    private static final String POSTO_ITT = "ITT";
    private static final String POSTO_PIT = "PIT";
    private static final String POSTO_EPB = "EPB";
    private static final String POSTO_ORP = "ORP";
    private static final String POSTO_PTI = "PTI";
    private static final String POSTO_CIRCULACAO = "Circulação";
    private static final String POSTO_CCO = "CCO";

    private static final String CARGO_SO1 = "SO1";
    private static final String CARGO_SL = "Supervisor";
    private static final String CARGO_CTR = "CTR";
    private static final String CARGO_OT = "OT";
    private static final String CARGO_TREINAMENTO = "Treinamento";
    private static final String CARGO_TORRE = "TORRE";
    private static final String CARGO_MAQUINA_LAVAR = "Máquina de Lavar";
    private static final String CARGO_TRONCO = "TRONCO";
    private static final String CARGO_CONSOLE_TRENS = "Console de trens";

    private static final String FALHA_DE_PORTAS = "Portas";
    private static final String FALHA_DE_TRACAO = "Tração";
    private static final String FALHA_FREIO_EMERGENCIA = "Freio de Emergência Aplicado";
    private static final String FALHA_DE_VAZAMENTO = "Vazamento";
    private static final String FALHA_REBOQUE = "Reboque";
    private static final String FALHA_DE_FOGO_SOB_CAIXA = "Fogo sob a caixa";
    private static final String FALHA_DE_FFR = "Freio Falha Remoção";
    private static final String FALHA_DE_PERDA_DE_COMANDO = "Perda de Comando";

    private static final String SINTOMA_FALHA_DE_PORTA = "Trem sem sinal de portas";
    private static final String SINTOMA_FALHA_DE_TRACAO = "Trem sem tração." +
            "\nVerificar sinal de portas fechadas, pressão de ar e código de via";
    private static final String SINTOMA_FREIO_EMERGENCIA = "Sinalização de FE";
    private static final String SINTOMA_VAZAMENTO = "Baixa pressão na tubulação, e ruído no local do vazamento";
    private static final String SINTOMA_FOGO_SOB_CAIXA = "Fumaça ou cheiro de queimado sem sinalização de FFR";
    private static final String SINTOMA_FFR = "Sinalização externa( amarela) e indicação de FFR na cabine";
    private TrafegoDbHelper mDbHelper;

    public InsertData(Context context) {
        mContext = context;
    }

    public void insertDataBaseInfo() {
        mDbHelper = new TrafegoDbHelper(mContext);
        insertFrota();
        insertFones();
        insertFalhas();
    }

    private void insertFrota() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E01");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E02");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E03");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E04");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E05");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E06");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E07");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E08");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E09");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E10");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_E);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "E11");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G12");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G13");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G14");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G15");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G16");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G17");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G18");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G19");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G20");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G21");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G22");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G23");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G24");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G25");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G26");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_G);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "G27");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H52");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H53");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H54");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H55");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H56");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H57");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H58");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H59");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H60");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H61");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H62");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H63");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H64");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H65");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H66");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H67");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_H);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "H68");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I01");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I02");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I03");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I04");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I05");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I06");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I07");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I08");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I09");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I10");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I11");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I12");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I13");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I14");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I15");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I16");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I17");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I18");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I19");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I20");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I21");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I22");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I23");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I24");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_I);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "I25");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J26");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J27");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J28");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J29");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J30");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J31");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J32");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J33");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J34");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J36");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J37");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J38");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J39");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J40");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J41");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J42");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J43");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J44");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J45");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J46");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J48");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J49");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_2);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J50");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_J);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "J51");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K01");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K02");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K03");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K04");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K05");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K06");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K07");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K08");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K09");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K10");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K11");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K12");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K13");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K14");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K15");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K16");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K17");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K18");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K19");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K20");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K22");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K23");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K24");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_K);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_3);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "K25");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L26");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L27");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L28");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L29");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L31");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L32");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L33");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L34");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L35");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L36");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L37");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L38");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L39");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L40");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L41");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L42");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L44");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L45");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L46");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_L);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_1);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "L47");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M03");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M05");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M06");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M07");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M08");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M09");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M10");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M11");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M12");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M13");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M15");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M16");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M17");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M18");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M19");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M20");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M22");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M23");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M24");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M25");
        db.insert(FrotaEntry.TABLE_NAME, null, values);

        values.put(FrotaEntry.COLUMN_FROTAS_FROTA, FROTA_M);
        values.put(FrotaEntry.COLUMN_FROTAS_LINHA, LINHA_15);
        values.put(FrotaEntry.COLUMN_FROTAS_NOME, "M27");
        db.insert(FrotaEntry.TABLE_NAME, null, values);
    }

    private void insertFones() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_JAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "3251-6000");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_JAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SO1);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106716");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_JAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106717\n106737");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_JAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106718\n106728");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_JAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106719\n106735");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "5060-4150");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "100305");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "100262\n106792");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "100430");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TREINAMENTO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "100285");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TORRE);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "11104");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PAT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_MAQUINA_LAVAR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "100233");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CIRCULACAO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "LIT");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "105610");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CIRCULACAO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "TUC");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "104524");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_1);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CONSOLE_TRENS);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "11101");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ANT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "3251-6000");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ANT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SO1);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106016\n205623");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ANT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106017\n106026");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ANT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106018");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ANT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "106019\n106020");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "2060-9800");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200017");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200018");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TREINAMENTO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "205728");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TORRE);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "11105");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_MAQUINA_LAVAR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200027");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_2);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CONSOLE_TRENS);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "21101");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ITT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SO1);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "34916");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ITT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "34917");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ITT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "34924");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ITT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "34918");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "2205-1222");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)207");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CTR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)209\n34995");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)208");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TREINAMENTO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)259\n34994");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TORRE);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)200\n34993");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PIT);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_MAQUINA_LAVAR);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "(88)312");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_EPB);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_OT);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "35792");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_EPB);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TORRE);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "35778\n35779");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CIRCULACAO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "BET");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "35710\n35723");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CIRCULACAO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "PSE");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "15513");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CIRCULACAO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "BFU");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "36541");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_3);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CONSOLE_TRENS);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "31101");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_15);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ORP);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "2672-8130");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_15);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_ORP);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "SO1\nSupervisor\nOT");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "155216");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, LINHA_15);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_CONSOLE_TRENS);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "151101");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTI);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_TRONCO);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "3251-6000\n73257");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTI);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "José Frederico\n\nEssoci\n\nMariza\n\nOdair Pezzi");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200019");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTI);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "Ana\n\nAugusto José\n\nCarlos\n\nAilton\n\nRamiro");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200020");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_PTI);
        values.put(FonesEntry.COLUMN_FONES_CARGO, CARGO_SL);
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "200016");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "Alexandra");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "72147");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "Roberto Santana");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "72276");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "Roson Gonzales");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "72275");
        db.insert(FonesEntry.TABLE_NAME, null, values);

        values.put(FonesEntry.COLUMN_FONES_LINHA, APOIO);
        values.put(FonesEntry.COLUMN_FONES_POSTO, POSTO_CCO);
        values.put(FonesEntry.COLUMN_FONES_CARGO, "Wellington Augusto");
        values.put(FonesEntry.COLUMN_FONES_NUMERO, "72274");
        db.insert(FonesEntry.TABLE_NAME, null, values);
    }

    private void insertFalhas() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_E);
        values.put(COLUMN_FALHAS_FALHA, mContext.getString(R.string.falha_eletrica));
        values.put(COLUMN_FALHAS_SINTOMA, mContext.getString(R.string.sintoma_falha_eletrica_frota_e));
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_eletrica_frota_e));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_G);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_g));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_H);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_h));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_I);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_i));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_J);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_j));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_K);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_k));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PORTAS);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_PORTA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_porta_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FALHA_DE_TRACAO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_tracao_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FREIO_EMERGENCIA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_freio_emergencia_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_VAZAMENTO);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_VAZAMENTO);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_vazamento_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_REBOQUE);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_reboque_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FOGO_SOB_CAIXA);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_fogo_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_FFR);
        values.put(COLUMN_FALHAS_SINTOMA, SINTOMA_FFR);
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_ffr_frota_l));
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_FALHAS_FROTA, FROTA_L);
        values.put(COLUMN_FALHAS_FALHA, FALHA_DE_PERDA_DE_COMANDO);
        values.put(COLUMN_FALHAS_SINTOMA, "");
        values.put(COLUMN_FALHAS_SOLUCAO, mContext.getString(R.string.falha_perda_comando_frota_l));
        db.insert(TABLE_NAME, null, values);
    }
}