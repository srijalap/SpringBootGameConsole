package com.example.maintenance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MaintenanceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MaintenanceApplication.class, args);
		System.out.println("This is my first Game app");

		// Retrieve the GameRunner bean from the application context
		GameRunner gameRunner = context.getBean(GameRunner.class);

		// Run the GameRunner to play different games
		gameRunner.runGames();


	}
}
