package com.udemyjava.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemyjava.learnspringframework.game.GameRunner;
import com.udemyjava.learnspringframework.game.GamingConsole;
import com.udemyjava.learnspringframework.game.MarioGame;
import com.udemyjava.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		// game object class - Mario
		// GamingConsole game = new MarioGame();
		GamingConsole game = new SuperContraGame();
		
		// game runner class
		// Tightly Coupled
		// SuperContraGame -> error
		// its constructor has MarioGame argument
		GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}
