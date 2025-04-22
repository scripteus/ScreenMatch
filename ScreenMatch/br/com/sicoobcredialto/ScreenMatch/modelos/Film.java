package br.com.sicoobcredialto.ScreenMatch.modelos;

public class Film {

    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInPlan;
    private double sumOfRatings;
    private double totalRatings;

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void submitRate (double rate) {
        sumOfRatings += rate;
        totalRatings++;
    }
    public void getAverageRate () {
        this.totalRatings = this.sumOfRatings / 3;
    }

    public void showTechnicalSheet () {
        System.out.println("Name of the film: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration: " + durationInMinutes + " min");
        System.out.println("Included in plan: " + includedInPlan);
        System.out.printf("Sum of rating: %.2f\n", sumOfRatings);
        System.out.printf("Total rating: %.2f\n", totalRatings);
    }
}