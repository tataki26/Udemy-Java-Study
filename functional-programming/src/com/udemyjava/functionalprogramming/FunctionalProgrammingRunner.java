package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner
{
	// OOP
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Apple","Banana","Cat","Dog");
		
		printBasic(list);

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
	
}
