package com.example.SayHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class SayHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayHelloWorldApplication.class, args);
	}

}
