package br.com.alura.screenmatch.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoas("Lucas", 25));
        listaDePessoas.add(new Pessoas("Ana", 30));
        listaDePessoas.add(new Pessoas("João", 20));
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas.toString());
        for (Pessoas pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
