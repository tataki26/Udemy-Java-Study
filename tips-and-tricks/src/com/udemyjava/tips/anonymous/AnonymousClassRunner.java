package com.udemyjava.tips.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2)
	{
		return Integer.compare(str1.length(), str2.length());
	}
	
}

public class AnonymousClassRunner
{

	public static void main(String[] args)
	{
		List<String> animals = new ArrayList<String>(
				Arrays.asList("Ant", "Cat", "Ball", "Elephant"));
		
		// Collections.sort(animals); // alphabet order
		
		// too complicated
		// Collections.sort(animals, new LengthComparator()); // length order
		
		// to use anonymous class
		// it has instance name, but not class name
		// do not use it multiple times (not reusable)
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2)
			{
				return Integer.compare(str1.length(), str2.length());
			}
		};
		
		Collections.sort(animals, lengthComparator);
		System.out.println(animals);
				
	}

}
