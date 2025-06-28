package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme("O poderoso chefão", 1972);
        System.out.println("-----------------------------------");
        poderosoChefao.setDuracaoEmMinutos(180);
        poderosoChefao.avalia(8);
        poderosoChefao.avalia(5);
        poderosoChefao.avalia(10);

        poderosoChefao.exibeFichaTecnica();
        System.out.println(STR. "Duração do filme: \{poderosoChefao.getDuracaoEmMinutos()} minutos");
        System.out.println(STR. "Total de avaliações: \{poderosoChefao.getTotalDeAvaliacoes()} ");
        System.out.println(STR. "A média de avaliações do meu filme é: \{String.format("%.2f", poderosoChefao.pegaMedia())} ");

        //poderosoChefao.somaDasAvaliacoes = 10;
        //poderosoChefao.totalDeAvaliacoes = 1;
        //System.out.println(poderosoChefao.pegaMedia());

        Serie lost = new Serie("Lost", 2000, 10);
        System.out.println("-----------------------------------");
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        lost.exibeFichaTecnica();
        System.out.println(STR. "Duração para maratonar Lost: \{lost.getDuracaoEmMinutos()} minutos");

        Filme avatar = new Filme("Avatar", 2023);
        System.out.println("-----------------------------------");
        avatar.setDuracaoEmMinutos(200);

        avatar.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        System.out.println("-----------------------------------");
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        //System.out.println("-----------------------------------");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(poderosoChefao);

        Episodio episodio = new Episodio();
        System.out.println("-----------------------------------");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme dogville = new Filme("Dogville", 2003);
        dogville.setDuracaoEmMinutos(200);
        dogville.avalia(10);
        dogville.exibeFichaTecnica();
        System.out.println("-----------------------------------");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(poderosoChefao);
        listaDeFilmes.add(avatar);
        listaDeFilmes.add(dogville);
        System.out.println(STR. "Tamanho da lista: \{listaDeFilmes.size()}");
        System.out.println(STR. "Primeiro Filme: \{listaDeFilmes.get(0).getNome()}");
        System.out.println(listaDeFilmes);


    }
}