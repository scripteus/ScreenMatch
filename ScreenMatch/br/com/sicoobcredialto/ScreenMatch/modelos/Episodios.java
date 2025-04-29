package br.com.sicoobcredialto.ScreenMatch.modelos;

import br.com.sicoobcredialto.ScreenMatch.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int number;
    private String name;
    private String serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerie(String gameOfThrones) {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews += totalViews;
    }


    @Override
    public int getClassificacao() {
        if (totalViews > 100) {
            return 10;
        } else if (totalViews > 50) {
            return 6;
        } else {
            return 3;
        }
    }
}
