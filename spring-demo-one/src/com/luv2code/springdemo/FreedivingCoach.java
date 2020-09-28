package com.luv2code.springdemo;

public class FreedivingCoach implements Coach {

	private FortuneService fortuneService;
	
	public FreedivingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "5 times 50 meters underwater";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
