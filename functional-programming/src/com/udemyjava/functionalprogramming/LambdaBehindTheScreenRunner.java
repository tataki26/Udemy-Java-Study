package com.udemyjava.functionalprogramming;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>
{

	@Override
	public boolean test(Integer number)
	{
		return number % 2 == 0;
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer>
{

	@Override
	public Integer apply(Integer number)
	{
		return number * number;
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
			// .map(n -> n * n)
			.map(new NumberSquareMapper())
			//.forEach(e -> System.out.println(e));
			.forEach(new SystemOutConsumer());

		// .filter()
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);
		
		// .forEach()
		// Consumer<? super T> action
		// void accept(T t);
		
		// .map()
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
	}

}
