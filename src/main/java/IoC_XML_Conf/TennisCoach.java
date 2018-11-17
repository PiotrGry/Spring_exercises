package IoC_XML_Conf;

import DI_XML_Conf.FortuneService;

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
