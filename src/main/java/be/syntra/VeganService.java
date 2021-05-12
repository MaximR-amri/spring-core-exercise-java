package be.syntra;

public class VeganService implements DietService {
    @Override
    public String getRecommendation() {
        return "Avoid everything that tastes good";
    }
}
