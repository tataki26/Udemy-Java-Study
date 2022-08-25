package com.udemyjava.ifstatement.examples;

public class SwitchExercisesRunner
{

	public static void main(String[] args)
	{
		System.out.println(isWeekDay(0));
		System.out.println(determineNameOfMonth(12));
		System.out.println(determineNameOfDay(1));

	}
	
	public static boolean isWeekDay(int dayNumber)
	{
		boolean result = false;
		
		switch(dayNumber)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				result = true;
				break;
			// case 0: // same result
			// case 6:
			default:
				result = false;
				break;

		}
		
		return result;
	}
	
	public static String determineNameOfMonth(int monthNumber)
	{
		String result = "";
		
		switch(monthNumber)
		{
			case 1:
				result = "January";
				break;
			case 2:
				result = "February";
				break;
			case 3:
				result = "March";
				break;
			case 4:
				result = "April";
				break;
			case 5:
				result = "May";
				break;
			case 6:
				result = "June";
				break;
			case 7:
				result = "Jul";
				break;
			case 8:
				result = "August";
				break;
			case 9:
				result = "September";
				break;
			case 10:
				result = "October";
				break;
			case 11:
				result = "November";
				break;
			case 12:
				result = "December";
				break;
			default:
				result = "Invalid";
				break;
		
		}
		
		return result;
		
	}
	
	public static String determineNameOfDay(int dayNumber)
	{
		String result = "";
		
		switch(dayNumber)
		{
			case 0:
				result = "Sunday";
				break;
			case 1:
				result = "Monday";
				break;
			case 2:
				result = "Tuesday";
				break;
			case 3:
				result = "Wednesday";
				break;
			case 4:
				result = "Thursday";
				break;
			case 5:
				result = "Friday";
				break;
			case 6:
				result = "Saturday";
				break;
			default:
				result = "Invalid";
				break;

		}
		
		return result;
		
	}

}
