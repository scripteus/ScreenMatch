public static void main () {

    Film sheetFilms = new Film();
    sheetFilms.name = "Top Gun: Maverick";
    sheetFilms.releaseYear = 2023;
    sheetFilms.durationInMinutes = 240;
    sheetFilms.includedInPlan = true;

    sheetFilms.submitRate(5);
    sheetFilms.submitRate(9);
    sheetFilms.submitRate(8);

    sheetFilms.getAverageRate(); // sum a average
    sheetFilms.showTechnicalSheet(); // print everything
}