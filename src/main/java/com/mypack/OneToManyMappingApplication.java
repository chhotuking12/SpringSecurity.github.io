package com.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.mypack")
public class OneToManyMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
		System.out.println("Test................");
	}

}
