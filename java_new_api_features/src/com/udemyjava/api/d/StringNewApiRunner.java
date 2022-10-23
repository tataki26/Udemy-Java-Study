package com.udemyjava.api.d;

import java.util.Arrays;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner
{

	public static void main(String[] args)
	{
		System.out.println("".isBlank());
		System.out.println(" ".isBlank());
		
		System.out.println(" LR ".strip().replace(" ","@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
		
		System.out.println("Hello,World".transform(s -> {
			return Arrays.asList(s.split(","));
		}));
		
		System.out.println("My name is %s. My age is %d.".formatted("Teemo",5));
		
		String str = null;
		// str error
		System.out.println(str.isBlank());
		
		SampleClass sampleClass = new SampleClass();
		// sampleClass.str error
		System.out.println(sampleClass.str.isBlank());
		
	}

}
