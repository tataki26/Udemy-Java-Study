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
		System.out.println(speed); // 100
		System.out.println(this.speed); // 0
		this.speed = speed;
	}
	
	int getSpeed()
	{
		return this.speed;
	}

}
