package com.udemyjava.loops;

public class MyNumberRunner
{

	public static void main(String[] args)
	{
		MyNumber number = new MyNumber(6);
		
		boolean isPrime = number.isPrime();
		
		System.out.println("isPrime: "+ isPrime);
		
		int sum = number.sumUptoN();
		
		System.out.println("sum: "+ sum);
		
		int sumOfDivisors = number.sumOfDivisors();
		
		System.out.println("sum of divisors: "+ sumOfDivisors);
		
		number.printANumberTriangle();

	}

}
