package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FPNumberRunner
{

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(4,6,8,13,3,15);
		
		nomalSum(numbers);
		
		int sum = numbers.stream()
			.reduce(0, (number1, number2) -> number1 + number2);
		
		System.out.println(sum);
	
	}

	private static int nomalSum(List<Integer> numbers)
	{
		int sum = 0;
		
		for(int num: numbers)
		{
			sum += num;
		}
		
		return sum;
	}
	
}
