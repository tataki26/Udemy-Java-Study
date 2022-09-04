package com.udemyjava.arrays;

public class StringRunner
{

	public static void main(String[] args)
	{
		// 1 
		
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
				"Friday", "Saturday" };
		
		
		// 2
		String mostLetter = "";
		
		for (String day : daysOfWeek)
		{
			if (day.length() > mostLetter.length())
				mostLetter = day;

		}
		
		System.out.println("most letter: " + mostLetter);
		
		// 3
		for (int i = daysOfWeek.length - 1; i >= 0; i--)
		{
			System.out.println(daysOfWeek[i]);
		}

	}

}
