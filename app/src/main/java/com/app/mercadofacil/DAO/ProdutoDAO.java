package com.app.mercadofacil.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.app.mercadofacil.dbslqite.ConexaoSQLite;
import com.app.mercadofacil.model.Produto;

public class ProdutoDAO {

    private final ConexaoSQLite conexaoSQLite;

    public ProdutoDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }

    public long salvarProdutoDao(Produto produto) {
        SQLiteDatabase dbSQLite = conexaoSQLite.getWritableDatabase();

        try {

            ContentValues values = new ContentValues();
           // values.put("pro_id", produto.getId());
            values.put("pro_nome", produto.getNome_produto());
            values.put("pro_departamento", produto.getDepartamento_produto());
            values.put("pro_corredor", produto.getCorredor_produto());

            long idProdutoInserido = dbSQLite.insert("produto", null, values);
            return idProdutoInserido;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }

}
