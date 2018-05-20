package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Value("${application.version}")
	private String applicationVersion;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("Version of the application is " + applicationVersion);
        System.out.println("====================================================");
        System.out.println("====================================================");
        System.out.println("====================================================");
    }
}
