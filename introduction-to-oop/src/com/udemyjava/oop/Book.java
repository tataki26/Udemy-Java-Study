package com.udemyjava.oop;

public class Book
{
	private int noOfCopies; // member variable

	public void setNoOfCopies(int noOfCopies) // local variable
	{
		if(noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}
	
	public int getNoOfCopies()
	{
		return noOfCopies;
	}
	
	public void increaseCopies(int howMuch)
	{
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseCopies(int howMuch)
	{
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}
