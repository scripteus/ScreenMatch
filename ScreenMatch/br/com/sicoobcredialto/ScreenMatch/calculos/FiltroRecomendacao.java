package br.com.sicoobcredialto.ScreenMatch.calculos;
import br.com.sicoobcredialto.ScreenMatch.modelos.Episodios;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        int classificacao = classificavel.getClassificacao();
        if (classificavel.getClassificacao() < 5) {
            System.out.println("Recomendação: Não assistir");
        } else if (classificavel.getClassificacao() >= 5 && classificavel.getClassificacao() < 8) {
            System.out.println("Recomendação: Assistir");
        } else {
            System.out.println("Recomendação: Assistir com amigos");
        }
    }
}
