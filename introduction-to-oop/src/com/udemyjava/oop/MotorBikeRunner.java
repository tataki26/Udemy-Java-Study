package com.udemyjava.oop;

public class MotorBikeRunner
{

	public static void main(String[] args)
	{
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.Start();
		honda.Start();
		
		ducati.speed = 100;
		honda.speed = 130;

	}

}
