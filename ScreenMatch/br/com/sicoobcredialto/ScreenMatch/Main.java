import br.com.sicoobcredialto.ScreenMatch.calculos.TempoDeFilme;
import br.com.sicoobcredialto.ScreenMatch.modelos.Filme;
import br.com.sicoobcredialto.ScreenMatch.modelos.Serie;
import br.com.sicoobcredialto.ScreenMatch.modelos.Synopse;

public static void main () {

    Synopse film1 = new Synopse();
    film1.setName("Top Gun: Maverick");
    film1.setReleaseYear(2023);
    film1.setDurationInMinutes(180);
    film1.setIncludedInPlan(true);
    film1.setDirector("Joseph Kosinski");

    film1.submitRate(5);
    film1.submitRate(9);
    film1.submitRate(8);

    Filme film2 = new Filme();
    film2.setName("Avatar: The Way of Water");
    film2.setReleaseYear(2023);
    film2.setDurationInMinutes(240);
    film2.setIncludedInPlan(true);
    film2.setDirector("James Cameron");

    film2.submitRate(5);
    film2.submitRate(7);
    film2.submitRate(7);

    Serie serie1 = new Serie();

    serie1.setSeasons(2);
    serie1.setEpisodes(24);

    TempoDeFilme tempo = new TempoDeFilme();

    tempo.includeHours(film1);

    // film1.getAverageRate(); // sum a average
    // film1.showTechnicalSheet(); // print everything

    System.out.println("------------------------------------");
    System.out.println(STR."Name of the film: \{film1.getName()}");
    System.out.println(STR."Release year: \{film1.getReleaseYear()}");
    System.out.println(STR."Duration in hours: \{tempo.getHours()}");
    System.out.println("------------------------------------");
}