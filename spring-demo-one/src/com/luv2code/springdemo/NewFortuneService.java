package com.luv2code.springdemo;

import java.util.Random;

public class NewFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		Random rn = new Random();
		int range = 4 - 0 + 1;
		int randomNum =  rn.nextInt(range) + 0;
		String [] fortunes = {"First fortune","Second fortune", "Thid fortune", "Fourth fortune", "Fifth fortune"};
		return fortunes [randomNum];
	}

}
