package be.syntra;

import org.springframework.stereotype.Component;

@Component("coach")
public class SwimCoach implements Coach {

    private DietService dietService;

    public SwimCoach(DietService dietService) {
        this.dietService = dietService;
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
