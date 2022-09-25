package com.udemyjava.generics;

import com.udemyjava.generics.MyCustomList;

public class GenericsRunner
{

	public static void main(String[] args)
	{
		// ArrayList<String> 
		MyCustomList list = new MyCustomList();
		
		list.addElement("Element1");
		list.addElement("Element2");
		
		// is it possible to add Integer in list2?
		MyCustomList list2 = new MyCustomList();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));

	}

}
