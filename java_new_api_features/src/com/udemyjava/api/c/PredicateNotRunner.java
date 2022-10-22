package com.udemyjava.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner
{

	public static void main(String[] args)
	{
		List<Integer> numbers = List.of(3,4,5,67,89,20);
		
		//
		// use predicate
		//
		/*
		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		
		// even
		numbers.stream()
			   .filter(evenNumberPredicate)
			   .forEach(System.out::println);
		
		// odd
		numbers.stream()
		   .filter(evenNumberPredicate.negate())
		   .forEach(System.out::println);
		*/
		
		//
		// use method
		//
		// even
		numbers.stream()
			   .filter(PredicateNotRunner::isEven)
			   .forEach(System.out::println);

		// odd
		numbers.stream()
		   .filter(Predicate.not(PredicateNotRunner::isEven))
		   .forEach(System.out::println);
		
	}
	
	public static boolean isEven(Integer number) {
		return number%2 == 0;
	}

}
