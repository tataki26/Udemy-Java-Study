package com.udemyjava.exception;

import java.util.Scanner;

public class TryWithResourcesRunner
{

	public static void main(String[] args)
	{
		// only try
		// try-with-resources
		// autoclosable
		try(Scanner scanner = new Scanner(System.in))
		{
			int[] numbers = {1,2,3,4};
			int number = numbers[21];
		}
		
	}

}
