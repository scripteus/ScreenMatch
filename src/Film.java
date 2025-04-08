public class Film {
    String title;
    String genre;
    double rating;
    int releaseYear;
    int durationInHours;

    Film filmOne() {
        Film topGun = new Film(); // Create a instance of the Film class
        topGun.title = "Top Gun: Maverick";
        topGun.genre = "Action";
        topGun.rating = 8.3;
        topGun.releaseYear = 2022;
        topGun.durationInHours = 2;
        return topGun;
    }

    Film filmTwo() {
        Film interstellar = new Film();
        interstellar.title = "Interstellar";
        interstellar.genre = "Sci-Fi";
        interstellar.rating = 8.6;
        interstellar.releaseYear = 2014;
        interstellar.durationInHours = 2;
        return interstellar;
    }
}


