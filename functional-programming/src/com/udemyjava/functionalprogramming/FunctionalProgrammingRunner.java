package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner
{
	// OOP
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Apple","Bat","Cat","Dog");
		
		printBasic(list);
		printBasicWithFiltering(list);
		printWithFPWithFiltering(list);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
		
		printWithFPWithFilteringOdd(list2);
		printWithFPWithFilteringEven(list2);

	}

	private static void printBasic(List<String> list)
	{
		for(String string:list)
		{
			System.out.println(string);
		}
	}
	
	// FP
	private static void printWithFP(List<String> list)
	{
		list.stream().forEach(
				// lambda
				// data[X] -> action
				element -> System.out.println("element - " + element));
	}
	
	private static void printBasicWithFiltering(List<String> list)
	{
		for(String string : list)
		{
			if(string.endsWith("at"))
			{
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFPWithFiltering(List<String> list)
	{
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - "+ element));
		
	}
	
	private static void printWithFPWithFilteringOdd(List<Integer> list)
	{
		list.stream()
			.filter(element -> (element % 2 == 1))
			.forEach(element -> System.out.println(element));
	}
	
	private static void printWithFPWithFilteringEven(List<Integer> list)
	{
		list.stream()
			.filter(element -> (element % 2 == 0))
			.forEach(element -> System.out.println(element));
	}
	
}
