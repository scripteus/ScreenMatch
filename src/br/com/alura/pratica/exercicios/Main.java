package br.com.alura.pratica.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        {
            produtos.add(new Produto("Produto 1", 10.0, 5));
            produtos.add(new Produto("Produto 2", 20.0, 3));
            produtos.add(new Produto("Produto 3", 15.0, 8));
        }

        ArrayList<Produto> produtosPereciveis = new ArrayList<>();
        {
            produtosPereciveis.add(new ProdutosPereciveis("Produto Perecível 1", 5.0, 10, 3 ));
            produtosPereciveis.add(new ProdutosPereciveis("Produto Perecível 2", 7.5, 4, 5));
            produtosPereciveis.add(new ProdutosPereciveis("Produto Perecível 3", 12.0, 2, 7));
        }

        System.out.println(produtos.size());
        System.out.println(produtos.toString());
        System.out.println(produtosPereciveis.get(0).getNome());
    }
}
