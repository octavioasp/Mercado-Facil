package com.app.mercadofacil.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.app.mercadofacil.R;
import com.app.mercadofacil.adapters.AdapterListaDeProdutos;
import com.app.mercadofacil.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarProdutosActivity extends AppCompatActivity {

    private ListView listViewProdutos;
    private List<Produto> produtoList;
    private AdapterListaDeProdutos adapterListaDeProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);

        //TODO buscar os produtos do banco


        this.produtoList = new ArrayList<>();
        this.listViewProdutos = (ListView) findViewById(R.id.listViewProdutos);
        this.adapterListaDeProdutos = new AdapterListaDeProdutos(ListarProdutosActivity.this, this.produtoList);
        this.listViewProdutos.setAdapter(this.adapterListaDeProdutos);
    }
}
