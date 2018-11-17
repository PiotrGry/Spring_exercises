package XML_Conf.DI_by_constructor;

import XML_Conf.FortuneService;
import XML_Conf.Coach;


public class BaseballCoach implements Coach {

     private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 min on batting practice";
    }

   public String getDailyFortune(){
      return fortuneService.getFortune();
   }
}
