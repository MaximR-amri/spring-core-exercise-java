package be.syntra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

    Coach coach = context.getBean("coach", Coach.class);

    //call method from bean
    System.out.println(coach.getDailyWorkout());

    //get diet recommendation
    System.out.println(coach.getDailyMeal());
    context.close();
  }

}