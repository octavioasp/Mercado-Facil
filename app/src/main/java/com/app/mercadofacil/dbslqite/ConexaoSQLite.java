package com.app.mercadofacil.dbslqite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoSQLite extends SQLiteOpenHelper {

    private static final int VERSAO_DB = 1;
    private static final String NOME_DB = "produtos_mercadofacil";
    private static ConexaoSQLite INSTANCIA_CONEXAO;

    public ConexaoSQLite(Context context) {
        super(context, NOME_DB, null, VERSAO_DB);
    }

    public static ConexaoSQLite getInstanciaConexao(Context context) {
        if (INSTANCIA_CONEXAO == null) {
            INSTANCIA_CONEXAO = new ConexaoSQLite(context);
        }
        return INSTANCIA_CONEXAO;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlTabelaProduto = "CREATE TABLE IF NOT EXISTS produto" +
                "(" +
              //  "pro_id INTEGER PRIMARY KEY," +
                "pro_nome TEXT," +
                "pro_departamento TEXT," +
                "pro_corredor INTEGER" +
                ")";
        sqLiteDatabase.execSQL(sqlTabelaProduto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
