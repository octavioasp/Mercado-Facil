package com.app.mercadofacil.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.mercadofacil.R;
import com.app.mercadofacil.model.Produto;

import java.util.List;

public class AdapterListaDeProdutos extends BaseAdapter {

    private Context context;
    private List<Produto> produtoList;

    public AdapterListaDeProdutos(Context context, List<Produto> produtoList) {
        this.context = context;
        this.produtoList = produtoList;
    }

    @Override
    // Tamanho da lista
    public int getCount() {
        return this.produtoList.size();
    }

    @Override
    //Retorna o elemento na posicao
    public Object getItem(int posicao) {
        return this.produtoList.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    public void removerProduto(int posicao) {
        this.produtoList.remove(posicao);
        notifyDataSetChanged();

    }

    @Override
    //Exibe os componentes
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View v = View.inflate(this.context, R.layout.layout_produto, null);

        TextView textViewNomeProduto = (TextView) v.findViewById(R.id.textViewNomeProduto);
        TextView textViewDepartamentoProduto = (TextView) v.findViewById(R.id.textViewDepartamentoProduto);
        TextView textViewCorredorProduto = (TextView) v.findViewById(R.id.textViewCorredorProduto);

        textViewNomeProduto.setText(this.produtoList.get(posicao).getNome_produto());
        textViewDepartamentoProduto.setText(this.produtoList.get(posicao).getDepartamento_produto());
        textViewCorredorProduto.setText(String.valueOf(this.produtoList.get(posicao).getCorredor_produto()));

        return v;
    }
}
