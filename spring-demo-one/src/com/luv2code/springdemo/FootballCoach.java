package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	NewFortuneService theFortune;
	
	public FootballCoach() {
		System.out.println("FootballCoach constructor");
	} 
	
	public void setTheFortune(NewFortuneService theFortune) {
		this.theFortune = theFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Run as much as you can";
	}

	@Override
	public String getDailyFortune() {
		return theFortune.getFortune();
	}

}
