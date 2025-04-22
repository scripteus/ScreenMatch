import br.com.sicoobcredialto.ScreenMatch.modelos.Film;

public static void main () {

    Film sheetFilms = new Film();
    sheetFilms.setName("Top Gun: Maverick");
    sheetFilms.setReleaseYear(2023);
    sheetFilms.setDurationInMinutes(240);
    sheetFilms.setIncludedInPlan(true);

    sheetFilms.submitRate(5);
    sheetFilms.submitRate(9);
    sheetFilms.submitRate(8);

    sheetFilms.getAverageRate(); // sum a average
    sheetFilms.showTechnicalSheet(); // print everything
}