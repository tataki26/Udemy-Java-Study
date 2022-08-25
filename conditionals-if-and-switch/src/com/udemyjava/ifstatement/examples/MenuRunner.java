package com.udemyjava.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		
		int number1 = scanner.nextInt();
		
		System.out.print("Enter Number2: ");
		
		int number2 = scanner.nextInt();
		
		System.out.println("Choices Available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.print("Enter Choice: ");
		int choice  = scanner.nextInt();
		
		System.out.println("Your Choices are");
		System.out.println("Number1 "+ number1);
		System.out.println("Number2 "+ number2);
		System.out.println("Choice "+ choice);
		
		int result = 0;
		
		if (number2 == 1)
			result = number1 + number2;
		else if(number2 == 2)
			result = number1 - number2;
		else if(number2 == 3)
			result = number1 / number2;
		else
			result = number1 * number2;
		
		System.out.println("Result is - "+result);
		
	}

}
