package be.syntra;

public class TennisCoach implements Coach {


    private DietService dietService;

    public TennisCoach() {
        this.dietService = new VeganService();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyMeal() {
        return dietService.getRecommendation();
    }



}
