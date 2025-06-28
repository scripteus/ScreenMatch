package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme poderosoChefao = new Filme("O poderoso chefão", 1972);
        poderosoChefao.avalia(10);

        Filme avatar = new Filme("Avatar", 2023);
        avatar.avalia(8);

        Filme dogville = new Filme("Dogville", 2003);
        dogville.avalia(9);

        Serie lost = new Serie("Lost", 2000, 10);
        lost.avalia(7);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(poderosoChefao);
        lista.add(avatar);
        lista.add(dogville);
        lista.add(lost);

        lista.forEach(item -> {
            System.out.println(STR. "\{item}");
            System.out.println(STR. "Classificação: \{((Filme) item).getClassificacao()} \n");
        });

//        for(Titulo item : lista) {
//    System.out.println("Nome: " +item.getNome());
//    if (item instanceof Filme filme && filme.getClassificacao() > 2) {
//        System.out.println("Classificação: " +filme.getClassificacao());
//    }
    }
}
