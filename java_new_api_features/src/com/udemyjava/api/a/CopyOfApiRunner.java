package com.udemyjava.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner
{

	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		
		names.add("Rakan");
		names.add("Jaya");
		names.add("Teemo");
	
		doNotChange(names);
		
		System.out.println(names);
		
		// 컴파일 불가
		// copyOf -> 불변 collection
		List<String> copyOfNames = List.copyOf(names);
		
		doNotChange(copyOfNames);
		
		System.out.println(copyOfNames);

	}
	
	private static void doNotChange(List<String> names) {
		names.add("ShouldNotbeAllowed");
	}

}
