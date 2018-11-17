package XML_Conf.DI_by_setter;

import XML_Conf.FortuneService;
import XML_Conf.Coach;

public class TennisCoach implements Coach {
    private FortuneService fortuneService;



    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do some tennis staff";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
