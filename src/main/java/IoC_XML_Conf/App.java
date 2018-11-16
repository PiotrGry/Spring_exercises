package IoC_XML_Conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach anotherCoach = context.getBean("baseballCoach",Coach.class);

        System.out.println(anotherCoach.getDailyFortune());
        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyWorkout());
    }
}
