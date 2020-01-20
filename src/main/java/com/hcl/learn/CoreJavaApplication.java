package com.hcl.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoreJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("To call method on call");
	}

}
