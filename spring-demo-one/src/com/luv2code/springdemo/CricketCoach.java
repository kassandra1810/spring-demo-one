package com.luv2code.springdemo;

// SETTER INJECTION EXAMPLE

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	// create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach no-arg constructor");	
	}
	
	// setters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach setFortuneService method");	
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach setEmail method");
		this.emailAdress = emailAdress;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach setTeam method");
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
