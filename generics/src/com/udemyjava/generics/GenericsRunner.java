package com.udemyjava.generics;

import com.udemyjava.generics.MyCustomList;

public class GenericsRunner
{

	public static void main(String[] args)
	{
		MyCustomList<String> list = new MyCustomList<>();
		
		list.addElement("Element1");
		list.addElement("Element2");
		
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		
		System.out.println(list2);
	
	}

}
