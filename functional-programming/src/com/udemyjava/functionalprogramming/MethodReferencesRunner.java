package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.function.Predicate;

public class MethodReferencesRunner
{

	public static void print(Integer number)
	{
		System.out.println(number);
	}
	
	public static boolean isEven(Integer number)
	{
		// 2. returning functions from methods
		return number % 2 == 0;
	}
	
	private static Predicate<? super Integer> createEvenPredicate()
	{
		return n -> n%2 == 0;
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
		
		// 1. Storing functions in variables
		// Predicate<? super Integer> evenPredicate = n -> n%2 == 0;
		// Predicate<? super Integer> oddPredicate = n -> n%2 == 1;
		
		// 2.
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		
		Integer max1 = Arrays.asList(23,45,67,34).stream()
				.filter(evenPredicate)
				.max((n1,n2) -> Integer.compare(n1,n2))
				.orElse(0);
		
		// 3. passing function to methods
		Integer max2 = Arrays.asList(23,45,67,34).stream()
							.filter(MethodReferencesRunner::isEven)
							.max(Integer::compare)
							.orElse(0);
		
		System.out.println(max2);

	}

}
