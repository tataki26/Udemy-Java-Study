package com.udemyjava.oop.interfaces;

public class GameRunner
{

	public static void main(String[] args)
	{
		MarioGame mario = new MarioGame();
		
		mario.up();
		mario.down();
		mario.left();
		mario.right();
		
		ChessGame chess = new ChessGame();
		
		chess.up();
		chess.down();
		chess.left();
		chess.right();
		
		GamingConsole game = new MarioGame();
		
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
