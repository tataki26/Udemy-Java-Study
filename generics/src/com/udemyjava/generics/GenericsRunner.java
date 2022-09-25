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
	
	// 상한 경계 와일드카드
	// Number 클래스를 연장하는 아무 리스트나 받을 수 있음
	static double sumOfNumberList(List<? extends Number> numbers)
	{
		double sum = 0.0;
		
		for(Number number:numbers)
		{
			sum += number.doubleValue();
		}
		
		return sum;
	}
	
	// 하한 경계 와일드카드
	// Number 클래스의  모든 하위 클래스 추가 가능
	static void addACoupleOfValues(List<? super Number> numbers)
	{
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	public static void main(String[] args)
	{
		// 하한
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		// 상한
		System.out.println(sumOfNumberList(Arrays.asList(1,2,3,4,5)));
		System.out.println(sumOfNumberList(Arrays.asList(1.1,2.1,3.1,4.1,5.1)));
		System.out.println(sumOfNumberList(Arrays.asList(1l,2l,3l,4l,5l)));
		
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
