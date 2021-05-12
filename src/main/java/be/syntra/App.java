package be.syntra;


public class App {

  public static void main(String[] args) {

    Coach coach = new SwimCoach();

    //call method from bean
    System.out.println(coach.getDailyWorkout());

    //get diet recommendation
    System.out.println(coach.getDailyMeal());

  }
}