package com.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PokemonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonProjectApplication.class, args);
	}

}
