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
			//String str = null;
			// error!!
			//str.length(); // NullPointerException
			
			int[] arr = {1,2};
			int number = arr[3]; // Exception
			
			// not working
			System.out.println("Method2 Ended");
		}
		catch(NullPointerException ex)
		{
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Matched ArrayIndexOutOfBoundsException");
		}
		// super class
		catch(Exception ex)
		{
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
		
	}

}
