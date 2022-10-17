package com.udemyjava.tips.nonaccess.package1;

class Player{
	private String name;
	private static int count; // only one instance, shared variable
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}
	
	// shared method
	public static int getCount() {
		// only static variable
		return count;
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
