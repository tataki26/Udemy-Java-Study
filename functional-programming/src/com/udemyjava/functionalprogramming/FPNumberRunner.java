package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner
{

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(4,6,8,13,3,15);
		
		nomalSum(numbers);
		
		int sum = fpSum(numbers);
		
		System.out.println(sum);
		
		// Exercise - Print squares of first 10 numbers!
		IntStream.range(1,10)
			.map(e->e*e)
			.forEach(e->System.out.println(e));
		
		// Map all of these to lower case and print them
		Arrays.asList("Apple","Ant","Bat").stream()
			.map(e -> e.toLowerCase())
			.forEach(e->System.out.println(e));
		
		// Print the length of each element
		Arrays.asList("Apple","Ant","Bat").stream()
			.map(e -> e.length())
			.forEach(e -> System.out.println(e));
	
	}

	// avoid mutation
	// what to do
	private static int fpSum(List<Integer> numbers)
	{
		return numbers.stream()
					.reduce(0, (number1, number2) -> number1 + number2);
	}

	// how to do
	private static int nomalSum(List<Integer> numbers)
	{
		int sum = 0;
		
		for(int num: numbers)
		{
			sum += num; // mutation(sum 값이 계속 변함)
		}
		
		return sum;
	}
	
}
