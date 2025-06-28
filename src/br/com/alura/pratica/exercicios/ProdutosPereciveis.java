package br.com.alura.pratica.exercicios;

public class ProdutosPereciveis extends Produto {

    private int diasParaVencer;

    public ProdutosPereciveis(String nome, double preco, int quantidade, int diasParaVencer) {
        super(nome, preco, quantidade);
        this.diasParaVencer = diasParaVencer;
    }


}
