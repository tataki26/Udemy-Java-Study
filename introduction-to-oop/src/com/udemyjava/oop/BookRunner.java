package com.udemyjava.oop;

public class BookRunner
{

	public static void main(String[] args)
	{
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);
		
		System.out.println("art of computer programming: "+artOfComputerProgramming.getNoOfCopies()); // 100
		System.out.println("effective java: "+effectiveJava.getNoOfCopies()); // 100
		System.out.println("clean code: "+cleanCode.getNoOfCopies()); // 100
		
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
 