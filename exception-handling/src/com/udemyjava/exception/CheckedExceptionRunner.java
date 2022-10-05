package com.udemyjava.exception;

public class CheckedExceptionRunner
{

	public static void main(String[] args)
	{
		/*
		// handling error directly
		try
		{
			someOtherMethod();
			// throws InterruptException
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		*/
		
		// not throw any error
		// someOtherMethod2();
		
		// unhandled exception
		someOtherMethod();
	}
	
	private static void someOtherMethod2() throws RuntimeException
	{
		
	}
	
	// handling error with throw [by force]
	// when error is difficult to be handled
	private static void someOtherMethod() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}
