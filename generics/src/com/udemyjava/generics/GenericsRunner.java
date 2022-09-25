package com.udemyjava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.udemyjava.generics.MyCustomList;

public class GenericsRunner
{
	
	static <X> X doubleValue(X value)
	{
		return value;
	}
	
	static <X extends List> void duplicate(X list)
	{
		list.addAll(list);
	}

	public static void main(String[] args)
	{
		String strVal = doubleValue(new String());
		Integer intVal = doubleValue(Integer.valueOf(5));
		ArrayList arrVal = doubleValue(new ArrayList());
		
		ArrayList<Integer> arrNums = new ArrayList<>(Arrays.asList(1,2,3));
		duplicate(arrNums);
		System.out.println(arrNums);
		
		LinkedList<Integer> linkedNums = new LinkedList<>(Arrays.asList(1,2,3));
		duplicate(linkedNums);
		System.out.println(linkedNums);
		
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
