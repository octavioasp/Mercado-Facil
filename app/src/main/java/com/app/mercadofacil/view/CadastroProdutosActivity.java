package com.app.mercadofacil.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.mercadofacil.R;
import com.app.mercadofacil.controller.ProdutoController;
import com.app.mercadofacil.dbslqite.ConexaoSQLite;
import com.app.mercadofacil.model.Produto;

public class CadastroProdutosActivity extends AppCompatActivity {

    private EditText editNomeProduto;
    private EditText editDepartamentoProduto;
    private EditText editCorredorProduto;
    private Button btSalvarProduto;

    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produtos);

        ConexaoSQLite conexaoSQLite = ConexaoSQLite.getInstanciaConexao(this);


        editNomeProduto = (EditText) findViewById(R.id.editNomeProduto);
        editDepartamentoProduto = (EditText) findViewById(R.id.editDepartamentoProduto);
        editCorredorProduto = (EditText) findViewById(R.id.editCorredorProduto);
        btSalvarProduto = (Button) findViewById(R.id.btSalvarProduto);

        this.clickBtSalvarListener();

    }

    private void clickBtSalvarListener() {
        this.btSalvarProduto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Produto produtoCadastrar = getProdutoCadastro();

                if (produtoCadastrar != null) {

                    ProdutoController produtoController = new ProdutoController
                            (ConexaoSQLite.getInstanciaConexao(CadastroProdutosActivity.this));

                    long idproduto = produtoController.salvarProdutoController(produtoCadastrar);

                    if (idproduto > 0) {
                        Toast.makeText(CadastroProdutosActivity.this, "Produto cadastrado com sucesso", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(CadastroProdutosActivity.this, "Produto não cadastrado", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(CadastroProdutosActivity.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    private Produto getProdutoCadastro() {
        this.produto = new Produto();
        if (this.editNomeProduto.getText().toString().isEmpty() == false) {
            this.produto.setNome_produto(this.editNomeProduto.getText().toString());
        } else {
            return null;
        }
        if (this.editDepartamentoProduto.getText().toString().isEmpty() == false) {
            this.produto.setDepartamento_produto(this.editDepartamentoProduto.getText().toString());
        } else {
            return null;
        }
        if (this.editCorredorProduto.getText().toString().isEmpty() == false) {
            int corredor = Integer.parseInt(this.editCorredorProduto.getText().toString());
            this.produto.setCorredor_produto(corredor);
        } else {
            return null;
        }

        return produto;
    }


}
