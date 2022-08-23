package com.udemyjava.oop;

public class MotorBikeRunner
{

	public static void main(String[] args)
	{
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		
		System.out.println("ducati: " + ducati.getSpeed()); // 100
		System.out.println("honda: " + honda.getSpeed()); // 200
		
		ducati.Start();
		honda.Start();
		
		// ducati.speed = 100;
		// honda.speed = 130;
		
		ducati.setSpeed(100);
		honda.setSpeed(130);
		
		/*
		int dSpeed = ducati.getSpeed(); // get ducati speed
		dSpeed += 100; // increase it by 100
		ducati.setSpeed(dSpeed); // set it to ducati *****
		*/
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		
		honda.decreaseSpeed(30);
		
		System.out.println("ducati: " + ducati.getSpeed());
		System.out.println("honda: " + honda.getSpeed());
		
	}

}
