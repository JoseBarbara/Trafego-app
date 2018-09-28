package com.rodrigoneves.trafegometro.data;

import android.provider.BaseColumns;

public class TrafegoContract {

    private TrafegoContract() {}

    public static final class FrotaEntry implements BaseColumns {
        public static final String TABLE_NAME = "frotas";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_FROTAS_FROTA = "frota";
        public static final String COLUMN_FROTAS_LINHA = "linha";
        public static final String COLUMN_FROTAS_NOME = "nome";
    }

    public static final class FonesEntry implements BaseColumns {
        public static final String TABLE_NAME = "telefones";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_FONES_LINHA = "linha";
        public static final String COLUMN_FONES_POSTO = "posto";
        public static final String COLUMN_FONES_CARGO = "cargo";
        public static final String COLUMN_FONES_NUMERO = "numero";
    }

    public static final class FalhasEntry implements BaseColumns {
        public static final String TABLE_NAME = "falhas";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_FALHAS_FROTA = "frota";
        public static final String COLUMN_FALHAS_FALHA = "falha";
        public static final String COLUMN_FALHAS_SINTOMA = "sintoma";
        public static final String COLUMN_FALHAS_SOLUCAO = "solucao";
    }
}
