package IoC_XML_Conf;

import DI_XML_Conf.FortuneService;


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
