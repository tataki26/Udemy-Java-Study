package com.udemyjava.oop;

public class MotorBike
{
	// state(member variable)
	// encapsulation
	private int speed;
	
	// behavior
	void Start()
	{
		System.out.println("Bike Started");
	}
	
	// input - speed
	// output - void
	// name - setSpeed
	void setSpeed(int speed) // local variable
	{
		if (speed > 0)
			this.speed = speed;
	}
	
	int getSpeed()
	{
		return this.speed;
	}
	
	int increaseSpeed(int howMuch)
	{
		return this.speed += howMuch;
	}
	
	int decreaseSpeed(int howMuch)
	{
		return this.speed -= howMuch;
	}

}
