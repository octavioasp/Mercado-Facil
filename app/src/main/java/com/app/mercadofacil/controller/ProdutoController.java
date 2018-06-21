package com.app.mercadofacil.controller;

import com.app.mercadofacil.DAO.ProdutoDAO;
import com.app.mercadofacil.dbslqite.ConexaoSQLite;
import com.app.mercadofacil.model.Produto;

public class ProdutoController {

    private final ProdutoDAO produtoDAO;

    public ProdutoController(ConexaoSQLite conexaoSQLite) {
        produtoDAO = new ProdutoDAO(conexaoSQLite);
    }

    public long salvarProdutoController(Produto produto) {
        return this.produtoDAO.salvarProdutoDao(produto);
    }
}
