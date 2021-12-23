package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElkApplication.class, args);
		// BasicConfigurator.configure();
		// BasicConfigurator.configure(); ya mana is lia likhaa ha ka ma log4j
		// ka standered do log4j.properties ma agar ma waha pa log4j.properties
		// wali file ni bna raha ho ma ma logges ko console ma print karwamna
		// ka lia ya likho ka main method ma
		
	}

}
