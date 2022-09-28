package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>
{

	@Override
	public boolean test(Integer number)
	{
		return number % 2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer number)
	{
		System.out.println(number);
		
	}
	
}

public class LambdaBehindTheScreenRunner
{

	public static void main(String[] args)
	{
		Arrays.asList(23,43,34,45,36,48).stream()
			// .filter(n -> n % 2 == 0)
			.filter(new EvenNumberPredicate())
			//.forEach(e -> System.out.println(e));
			.forEach(new SystemOutConsumer());

		// .filter()
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);
		
		// .forEach()
		// Consumer<? super T> action
		// void accept(T t);
	}

}
