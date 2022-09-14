package com.udemyjava.oop.interfaces;

interface Flyable
{
	void fly();
}

class Bird implements Flyable
{

	@Override
	public void fly()
	{
		System.out.println("Fly with wings");
		
	}
	
}

class Aeroplane implements Flyable
{

	@Override
	public void fly()
	{
		System.out.println("Fly with fuel");
		
	}
	
}

public class FlyableRunner
{

	public static void main(String[] args)
	{
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		
		for(Flyable flyable: flyingObjects)
		{
			flyable.fly();
		}

	}

}
