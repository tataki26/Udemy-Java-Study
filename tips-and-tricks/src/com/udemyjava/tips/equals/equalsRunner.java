package com.udemyjava.tips.equals;

class Client {
	private int id;

	public Client(int id)
	{
		super();
		this.id = id;
	}

	// hastmap with bucket
	// hashing function = hashcode
	// each object is assigned to each bucket
	// if two objects get same id, their hashcode must be same
	// and never change its value
	// to use equals method, hashcode is necessary
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object that)
	{
		if (this == that)
			return true;
		if (that == null)
			return false;
		// Object(parent class)
		// not Client(child class)
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		if (id != other.id)
			return false;
		return true;
	}
	
}

public class equalsRunner
{

	public static void main(String[] args)
	{
		// same id
		Client c1 = new Client(1);
		Client c2 = new Client(1);

		// only same object(same memory) -> true
		// before override equals
		System.out.println(c1.equals(c2)); // false
		// after override equals
		System.out.println(c1.equals(c2)); // true 
	}

}
