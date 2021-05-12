package be.syntra;

public class SwimCoach implements Coach {

    private DietService dietService;

    public SwimCoach() {
        this.dietService = new VeggieService();
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }

    @Override
    public String getDailyMeal() {
        return dietService.getRecommendation();
    }


}
