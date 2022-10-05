package com.udemyjava.exception;

import java.util.Scanner;

public class FinallyRunner
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		
		try
		{
			scanner = new Scanner(System.in);
			
			int[] numbers = {1,2,3,4};
			int number = numbers[5];
			
			// not working
			System.out.println("Close scanner");
			// waste of memory
			// scanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// always working
			// with null check
			if(scanner!=null)
			{	
				scanner.close();
				System.out.println("Scanner is closed");
			}
		}
		// working -> after exception handling
		System.out.println("Just before closing out main");

	}

}
