package com.udemyjava.generics;

import com.udemyjava.generics.MyCustomList;

public class GenericsRunner
{

	public static void main(String[] args)
	{
		MyCustomList<String> list = new MyCustomList<>();
		
		list.addElement("Element1");
		list.addElement("Element2");
		
		String value = list.get(0);
		
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		Integer value2 = list2.get(0);
		
		System.out.println(value2);
		
	}

}
