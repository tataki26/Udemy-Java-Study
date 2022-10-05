package com.udemyjava.exception;

public class ExceptionHandlingRunner2
{

	public static void main(String[] args)
	{
		method1();
		System.out.println("Main Ended");

	}

	private static void method1()
	{
		method2();
		System.out.println("Method1 Ended");
		
	}

	private static void method2()
	{
		try 
		{
			String str = null;
			// error!!
			str.length();
			
			// not working
			System.out.println("Method2 Ended");
		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
