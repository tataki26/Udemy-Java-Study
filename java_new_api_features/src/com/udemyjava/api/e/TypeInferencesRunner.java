package com.udemyjava.api.e;

import java.util.List;

public class TypeInferencesRunner
{

	public static void main(String[] args)
	{
		List<String> names1 = List.of("Rakan", "Jaya");
		List<String> names2 = List.of("Ashe", "Teemo");

		// List<List<String>> names = List.of(names1, names2);
		
		// type inference
		var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);
		
		for(var name:names1)
			System.out.println(names);
		
		// not keyword
		var var = "";
		
		var filter = List.of("Rakan","Jaya").stream()
							   .filter(s -> s.length() < 5);
		
		filter.forEach(System.out::println);
		
	}

}
