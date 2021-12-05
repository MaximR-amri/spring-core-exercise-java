package be.syntra;

import org.springframework.stereotype.Component;

@Component
public class PaleoService implements DietService{
    @Override
    public String getRecommendation() {
            return "Eat Meat";
    }
}
