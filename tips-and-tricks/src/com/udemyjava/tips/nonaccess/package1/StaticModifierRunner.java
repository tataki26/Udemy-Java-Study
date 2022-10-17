package com.udemyjava.tips.nonaccess.package1;

class Player{
	private String name;
	private static int count; // only one instance, shared variable
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

public class StaticModifierRunner
{

	public static void main(String[] args)
	{
		Player player1 = new Player("Rakan");
		Player player2 = new Player("Jaya");
		
		// separate instance
		// static -> execute after player2 is created
		System.out.println(player1.getCount()); // 1 -> static: 2
		System.out.println(player2.getCount()); // 1 -> static: 2

	}

}
