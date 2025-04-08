public class Film {

    String name;
    int releaseYear;
    int durationInMinutes;
    boolean includedInPlan;
    double sumOfRatings;
    double totalRatings;

    void submitRate (double rate) {
        sumOfRatings += rate;
        totalRatings ++;
    }

    void getAverageRate () {
        this.totalRatings = this.sumOfRatings / 3;
    }

    void showTechnicalSheet () {
        System.out.println("Name of the film: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration: " + durationInMinutes + " min");
        System.out.println("Included in plan: " + includedInPlan);
        System.out.printf("Sum of rating: %.2f\n", sumOfRatings);
        System.out.printf("Total rating: %.2f\n", totalRatings);
    }
}
