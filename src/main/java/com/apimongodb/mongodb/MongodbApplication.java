package com.apimongodb.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		
		
		return args -> {
			System.out.println("#################");
			System.out.println("#######SUBIU#####");
			System.out.println("#################");
		};
		
	}

}
