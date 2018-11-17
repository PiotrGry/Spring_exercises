package XML_Conf;

import XML_Conf.DI_set_values_from_file.CricketCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach baseballCoach = context.getBean("baseballCoach",Coach.class);
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println("-----------Baseball------------");
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(baseballCoach.getDailyWorkout()+"\n");

        System.out.println("---------Tennis---------");
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune()+"\n");

        System.out.println("----------Cricket-------------");
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
    }
}
