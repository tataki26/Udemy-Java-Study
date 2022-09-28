package com.udemyjava.functionalprogramming;

import java.util.Arrays;

public class MethodReferencesRunner
{

	public static void print(Integer number)
	{
		System.out.println(number);
	}
	
	public static boolean isEven(Integer number)
	{
		return number % 2 == 0;
	}
	
	public static void main(String[] args)
	{
		Arrays.asList("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
			.map(s -> s.length())
			//.forEach(s -> System.out.println(s));
			//.forEach(System.out::println);
			.forEach(s->MethodReferencesRunner.print(s));
		
		Arrays.asList("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		//.map(s -> s.length())
		.map(String::length)
		.forEach(MethodReferencesRunner::print);
		
		Integer max1 = Arrays.asList(23,45,67,34).stream()
				.filter(n -> n%2 == 0)
				.max((n1,n2) -> Integer.compare(n1,n2))
				.orElse(0);
		
		Integer max2 = Arrays.asList(23,45,67,34).stream()
							.filter(MethodReferencesRunner::isEven)
							.max(Integer::compare)
							.orElse(0);
		
		System.out.println(max2);

	}

}
