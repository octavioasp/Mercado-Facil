package com.app.mercadofacil.model;

public class Produto {

    private long id;
    private String nome_produto;
    private String departamento_produto;
    private int corredor_produto;

    public Produto() {
    }

    public String getDepartamento_produto() {
        return departamento_produto;
    }

    public void setDepartamento_produto(String departamento_produto) {
        this.departamento_produto = departamento_produto;
    }

    public int getCorredor_produto() {
        return corredor_produto;
    }

    public void setCorredor_produto(int corredor_produto) {
        this.corredor_produto = corredor_produto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", Produto: '" + nome_produto + '\'' +
                ", Departamento: '" + departamento_produto + '\'' +
                ", Corredor: " + corredor_produto +
                '}';
    }
}
