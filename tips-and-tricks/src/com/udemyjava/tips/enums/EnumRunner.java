package com.udemyjava.tips.enums;

import java.util.Arrays;

public class EnumRunner
{
	// able to use as instance variable
	// Season season;

	public static void main(String[] args)
	{
		Season season = Season.SPRING;
		System.out.println(season);
		
		// get enum instance by using string 
		Season season1 = Season.valueOf("WINTER"); // WINTER
		System.out.println(season1);
		System.out.println(season1.name()); // WINTER
		
		System.out.println(season.SPRING.ordinal());
		System.out.println(season.SPRING.getValue());
		
		// all values of enum
		System.out.println(Arrays.toString(Season.values()));
				
	}

}
