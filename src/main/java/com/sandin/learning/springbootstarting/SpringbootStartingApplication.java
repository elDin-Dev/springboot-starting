package com.sandin.learning.springbootstarting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStartingApplication {

	public static void main(String[] args) {
		ApplicationContext app =
				SpringApplication.run(SpringbootStartingApplication.class, args);

		for (String name : app.getBeanDefinitionNames()){
			System.out.println("name----------------->" + name);
		}
	}

}
