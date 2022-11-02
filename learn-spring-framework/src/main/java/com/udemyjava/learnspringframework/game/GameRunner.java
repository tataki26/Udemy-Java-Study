package com.udemyjava.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// when spring sees Component annotation class,
// it creates an instance of other Component annotation class
@Component
public class GameRunner
{
	// find component which can be type of dependency object
	@Autowired
	private GamingConsole game;
	
	public GameRunner(GamingConsole game)
	{
		System.out.println("Using Constructor");
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}


}
