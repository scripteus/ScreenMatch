package br.com.sicoobcredialto.ScreenMatch.modelos;

import br.com.sicoobcredialto.ScreenMatch.calculos.Classificavel;

public class Filme extends Synopse implements Classificavel {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) (getTotalRatings() / 2);
    }
}
