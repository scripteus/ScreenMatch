package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println(STR. "Duração do filme:  \{meuFilme.getDuracaoEmMinutos()} minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(STR. "Total de avaliações: \{meuFilme.getTotalDeAvaliacoes()}");
        System.out.printf("%.2f\n", meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        System.out.println("-------------------------------------");
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println(STR. "Duração para maratonar Lost: \{lost.getDuracaoEmMinutos()} ");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        System.out.println("-------------------------------------");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        System.out.println("-------------------------------------");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        System.out.println("-------------------------------------");
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println(STR. "Tamanho da lista \{listaDeFilmes.size()}");
        System.out.println(STR. "Primeiro filme \{listaDeFilmes.get(0).getNome()} ");
        System.out.println(listaDeFilmes);
        System.out.println(STR. "toString do filme \{listaDeFilmes.get(0).toString()} ");
        System.out.println(STR. "toString da série \{lost.toString()} ");
        listaDeFilmes.sort(Comparator.comparing(Filme::getAnoDeLancamento));
        System.out.println(STR. "Lista de filmes ordenada por ano de lançamento: \{listaDeFilmes} ");

    }
}