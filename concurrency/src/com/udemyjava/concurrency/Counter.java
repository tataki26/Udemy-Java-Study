package com.udemyjava.concurrency;

public class Counter
{
	private int i = 0;
	
	public void increment() {
		i++;
		// 1) get i
		// 2) increment
		// 3) set i
	}

	synchronized public int getI()
	{
		return i;
	}

}
