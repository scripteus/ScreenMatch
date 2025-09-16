package br.com.alura.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {

    //Data transfer object

    @Override
    public String toString() {
        return STR."\nTitle = \{title}\nRelease Year = \{year}\nDuration = \{runtime}";
    }
}
