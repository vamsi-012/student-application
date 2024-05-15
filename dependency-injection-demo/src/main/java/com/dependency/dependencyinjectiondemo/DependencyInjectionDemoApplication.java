package com.dependency.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		System.out.println("Application started.........");
	}
}
