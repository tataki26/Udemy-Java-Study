package com.udemyjava.concurrency;

public class BiCounter
{
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++;
		// 1) get i
		// 2) increment
		// 3) set i
	}

	public int getI()
	{
		return i;
	}
	
	synchronized public void incrementJ() {
		j++;
		// 1) get j
		// 2) increment
		// 3) set j
	}

	public int getJ()
	{
		return j;
	}

}
