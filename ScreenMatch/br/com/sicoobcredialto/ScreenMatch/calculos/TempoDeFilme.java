package br.com.sicoobcredialto.ScreenMatch.calculos;

import br.com.sicoobcredialto.ScreenMatch.modelos.Synopse;

public class TempoDeFilme {
    private int hours;

    public int getHours() {
        return hours;
    }

    public void includeHours(Synopse synopse) {
        this.hours += synopse.getDurationInMinutes() / 60;
    }
}
