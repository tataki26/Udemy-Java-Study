package com.udemyjava.oop;

public class MotorBike
{
	// state(member variable)
	// encapsulation
	private int speed;
	
	MotorBike(int speed)
	{
		this.speed = speed;
	}
	
	MotorBike()
	{
		this(5);
	}
	
	// behavior
	public void Start()
	{
		System.out.println("Bike Started");
	}
	
	// input - speed
	// output - void
	// name - setSpeed
	public void setSpeed(int speed) // local variable
	{
		if (speed > 0)
			this.speed = speed;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void increaseSpeed(int howMuch)
	{
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch)
	{
		setSpeed(this.speed - howMuch);
	}

}
