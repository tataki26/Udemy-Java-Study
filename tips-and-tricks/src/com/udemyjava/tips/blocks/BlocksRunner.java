package com.udemyjava.tips.blocks;

public class BlocksRunner
{

	public static void main(String[] args)
	{
		// bad
		// use block for scope
		if (3 > 2) 
			System.out.println("3 is bigger than 2");
		
		if (2 < 3)
		{
			System.out.println("2 is smaller than 3");
		}
		
		// i is valid only in block
		{
			int i = 10;
			System.out.println("hello");
			
		}
		
		// invalid
		// out of scope
		// System.out.println(i);

	}

}
