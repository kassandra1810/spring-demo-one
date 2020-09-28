package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDomoApp {

	public static void main(String[] args) {
		
		// load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		FootballCoach theCoach2 = context.getBean("myFootballCoach", FootballCoach.class);
		
		// call method on the bean
		System.out.println(theCoach2.getDailyWorkout());
		
		System.out.println(theCoach2.getDailyFortune());
		
		// call our new methods to get the literal values
		
/*		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());*/
		
		// close the context
		context.close();

	}

}
