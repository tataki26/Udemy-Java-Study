package com.udemyjava.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.udemyjava.learnspringframework.game.GameRunner;

// default
// the target of component scan: package(+ sub-packages)
// @ComponentScan("com.udemyjava.learnspringframework")
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// create application context
		// to manage components
		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		// choose adequate component(MarioGame, GameRunner)
		GameRunner runner = context.getBean(GameRunner.class);
		
		/*
		// game object class - Mario
		// GamingConsole game = new MarioGame();
		GamingConsole game = new SuperContraGame();
		
		// game runner class
		// Tightly Coupled
		// SuperContraGame -> error
		// its constructor has MarioGame argument
		GameRunner runner = new GameRunner(game);
		*/
		
		runner.runGame();
	}

}
