import br.com.sicoobcredialto.ScreenMatch.modelos.Titulo;

public static void main () {

    Titulo sheetFilms = new Titulo();
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