package be.syntra;


public class VeggieService implements DietService {
    @Override
    public String getRecommendation() {
        return "Salad and veggie wraps";
    }
}
