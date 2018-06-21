package com.app.mercadofacil.model;

public class Departamento {

    private long id;
    private String nome_departamento;
    private Produto produto;

    public Departamento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_departamento() {
        return nome_departamento;
    }

    public void setNome_departamento(String nome_departamento) {
        this.nome_departamento = nome_departamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nome_departamento='" + nome_departamento + '\'' +
                ", produto=" + produto.toString() +
                '}';
    }
}
