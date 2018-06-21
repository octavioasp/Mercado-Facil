package com.app.mercadofacil.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.app.mercadofacil.R;
import com.app.mercadofacil.controller.ProdutoController;
import com.app.mercadofacil.dbslqite.ConexaoSQLite;
import com.app.mercadofacil.model.Produto;

public class MercadosActivity extends AppCompatActivity {

    private Button btMercado1;
    private Button btCadastrarProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercados);

        ConexaoSQLite conexaoSQLite = new ConexaoSQLite(this);



        btMercado1 = (Button) findViewById(R.id.btMercado1);
        btCadastrarProdutos = (Button) findViewById(R.id.btCadastrarProdutos);

        btMercado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MercadosActivity.this, ListarProdutosActivity.class);
                startActivity(i);
                finish();
            }
        });

        btCadastrarProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MercadosActivity.this, CadastroProdutosActivity.class);
                startActivity(i);
                finish();
            }
        });


    }

}