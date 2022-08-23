package com.udemyjava.oop;

public class BookRunner
{

	public static void main(String[] args)
	{
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		/*
		artOfComputerProgramming.noOfCopies = 100;
		effectiveJava.noOfCopies = 20;
		cleanCode.noOfCopies = 80;
		*/
		
		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(20);
		cleanCode.setNoOfCopies(80);
		
		effectiveJava.increaseCopies(30);
		cleanCode.decreaseCopies(30);
		
		System.out.println("effective java: "+effectiveJava.getNoOfCopies());
		System.out.println("clean code: "+cleanCode.getNoOfCopies());
	}

}
 