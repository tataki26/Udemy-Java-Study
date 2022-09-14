package com.udemyjava.oop.interfaces;

public class GameRunner
{

	public static void main(String[] args)
	{
		
		/*
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
		*/
		
		// 같은 코드
		// 다형성
		// 다른 두 클래스에서 호출
		// 같은 코드가 두 개의 다른 행동 방식을 가진다
		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		
		for(GamingConsole game: games)
		{
			// 실행되는 코드는 같다
			game.up();
			game.down();
			game.left();
			game.right();
		};

	}

}
