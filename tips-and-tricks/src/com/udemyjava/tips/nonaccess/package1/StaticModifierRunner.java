package com.udemyjava.tips.nonaccess.package1;

// static final
// static -> class level
// final -> not able to extend
// static final -> not variable (constants)
// hard coding is not recommended -> not able to understand the meaning of value
// public static final int SECONDS_IN_MINUTE = 60;

class Player{
	// instance variable, member variable (unique per member)
	private String name;
	// class variable
	private static int count; // only one instance, shared variable
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}
	
	// shared method(class method)
	public static int getCount() {
		// not allowed
		// System.out.println(name); // instance variable
		// System.out.println(getName()); // instance method
		// only static variable
		return count;
	}
	
	public String getName()
	{
		// allowed
		System.out.println(count); // static variable in non-static method
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

public class StaticModifierRunner
{

	public static void main(String[] args)
	{
		Player player1 = new Player("Rakan");
		System.out.println(Player.getCount()); // 1
		
		Player player2 = new Player("Jaya");
		System.out.println(Player.getCount()); // 2
		
		// not recommended
		// static -> use class name
		// shared to all instances of the class
		// System.out.println(player2.getCount());
		
	}

}
