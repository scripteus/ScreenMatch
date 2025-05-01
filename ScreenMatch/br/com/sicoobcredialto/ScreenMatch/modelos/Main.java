package br.com.sicoobcredialto.ScreenMatch.modelos;

import br.com.sicoobcredialto.ScreenMatch.calculos.Classificavel;
import br.com.sicoobcredialto.ScreenMatch.calculos.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {

            Episodios primeiro = new Episodios();
            primeiro.setNumber(1);
            primeiro.setSerie("Plano");
            primeiro.setTotalViews(55);

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtrar(primeiro);
    }
}
